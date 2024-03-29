/**
 * This class is generated by jOOQ
 */
package tech.codingclub.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Coders extends org.jooq.impl.TableImpl<tech.codingclub.tables.records.CodersRecord> {

	private static final long serialVersionUID = 938663048;

	/**
	 * The singleton instance of <code>public.Coders</code>
	 */
	public static final tech.codingclub.tables.Coders CODERS = new tech.codingclub.tables.Coders();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<tech.codingclub.tables.records.CodersRecord> getRecordType() {
		return tech.codingclub.tables.records.CodersRecord.class;
	}

	/**
	 * The column <code>public.Coders.name</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.tables.records.CodersRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.Coders.age</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.tables.records.CodersRecord, java.lang.Long> AGE = createField("age", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.Coders</code> table reference
	 */
	public Coders() {
		this("Coders", null);
	}

	/**
	 * Create an aliased <code>public.Coders</code> table reference
	 */
	public Coders(java.lang.String alias) {
		this(alias, tech.codingclub.tables.Coders.CODERS);
	}

	private Coders(java.lang.String alias, org.jooq.Table<tech.codingclub.tables.records.CodersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Coders(java.lang.String alias, org.jooq.Table<tech.codingclub.tables.records.CodersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, tech.codingclub.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public tech.codingclub.tables.Coders as(java.lang.String alias) {
		return new tech.codingclub.tables.Coders(alias, this);
	}

	/**
	 * Rename this table
	 */
	public tech.codingclub.tables.Coders rename(java.lang.String name) {
		return new tech.codingclub.tables.Coders(name, null);
	}
}
