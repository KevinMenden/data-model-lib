package life.qbic.datamodel.accounting

/**
 * Describes an entity which packages all {@link ProductItem}s of the same type
 *
 * A product is of a defined by a {@link ProductCategory} and other traits that define how to handle items assigned to
 * that product.
 *
 * @since: 1.0
 * @author: Jennifer Bödker
 *
 */
class Product {

    /**
     * Describes the category of the product
     */
    final ProductCategory productCategory

    /**
     * Describes the currency under which the product is charged
     */
    final Currency currency

    /**
     * Provides a more detailed description of the product
     */
    final String description

    /**
     * The name of the product
     */
    final String productName

    /**
     * The price of one unit of the product
     */
    final Double unitPrice

    /**
     * The unit in which the product is offered
     */
    final String unit

    /**
     * States if the product can be proportioned or not
     */
    final Boolean proportionateAllowed


    Product(ProductCategory productCategory, Currency currency, String description, String productName, Double unitPrice, String unit, Boolean proportionateAllowed) {
        this.productCategory = productCategory
        this.currency = currency
        this.description = description
        this.productName = productName
        this.unitPrice = unitPrice
        this.unit = unit
        this.proportionateAllowed = proportionateAllowed
    }
}