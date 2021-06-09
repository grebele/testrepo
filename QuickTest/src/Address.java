

public class Address {
	private String city;
	private String postalCode;
	private String street;
	private String streetNumber;

	/**
	 * Constructs a complete mailing address.
	 * 
	 * @param aStreet
	 *           The street of the {@code Address}.
	 * @param aStreetNumber
	 *           The street number of the {@code Address}.
	 * @param aPostalCode
	 *           The postal code of the {@code Address}.
	 * @param aCity
	 *           The city of the {@code Address}.
	 */
	public Address(String aStreet, String aStreetNumber, String aPostalCode,
			String aCity) {
		street = aStreet;
		streetNumber = aStreetNumber;
		postalCode = aPostalCode;
		city = aCity;
	}

	/**
	 * Returns the city of this {@code Address}.
	 * 
	 * @return the city of this {@code Address}.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Returns the postal code of this {@code Address}.
	 * 
	 * @return the postal code of this {@code Address}.
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Returns the street of this {@code Address}.
	 * 
	 * @return the street of this {@code Address}.
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Returns the street number of this {@code Address}.
	 * 
	 * @return the street number of this {@code Address}.
	 */
	public String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * Sets the city of this {@code Address}.
	 * 
	 * @param aCity
	 *           the city of this {@code Address}.
	 */
	public void setCity(String aCity) {
		city = aCity;
	}

	/**
	 * Sets the postal code of this {@code Address}.
	 * 
	 * @param aPostalCode
	 *           the postal code of this {@code Address}.
	 */
	public void setPostalCode(String aPostalCode) {
		postalCode = aPostalCode;
	}

	/**
	 * Sets the street of this {@code Address}.
	 * 
	 * @param aStreet
	 *           the street of this {@code Address}.
	 */
	public void setStreet(String aStreet) {
		street = aStreet;
	}

	/**
	 * Sets the street number of this {@code Address}.
	 * 
	 * @param aStreetNumber
	 *           the street number of this {@code Address}.
	 */
	public void setStreetNumber(String aStreetNumber) {
		streetNumber = aStreetNumber;
	}

	/**
	 * Returns a string representation of this {@code Address}.
	 * 
	 * @return String representation of this {@code Address}.
	 */
	public String toString() {
		return street + " " + streetNumber + ", " + postalCode + " " + city;
	}
}
