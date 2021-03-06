package com.salesmanager.core.modules.order.total;

import com.salesmanager.core.business.catalog.product.model.Product;
import com.salesmanager.core.business.customer.model.Customer;
import com.salesmanager.core.business.merchant.model.MerchantStore;
import com.salesmanager.core.business.order.model.OrderSummary;
import com.salesmanager.core.business.order.model.OrderTotal;
import com.salesmanager.core.business.shoppingcart.model.ShoppingCartItem;
import com.salesmanager.core.modules.Module;

/**
 * Calculates order total based on specific
 * modules implementation
 * @author carlsamson
 *
 */
public interface OrderTotalPostProcessorModule extends Module {
	
	   /**
	    * Uses the OrderSummary and external tools for applying if necessary
	    * variations on the OrderTotal calculation.
	    * @param orderSummary
	    * @param shoppingCartItem
	    * @param product
	    * @param customer
	    * @param store
	    * @return
	    * @throws Exception
	    */
	   OrderTotal caculateProductPiceVariation(final OrderSummary summary, final ShoppingCartItem shoppingCartItem, final Product product, final Customer customer, final MerchantStore store) throws Exception;

}
