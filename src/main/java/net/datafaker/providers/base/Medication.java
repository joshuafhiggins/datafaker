package net.datafaker.providers.base;

public class Medication extends AbstractProvider<BaseProviders> {

    protected Medication(BaseProviders faker) {
        super(faker);
    }

    public String drugName() {
        return resolve("medication.drug_name");
    }
}
