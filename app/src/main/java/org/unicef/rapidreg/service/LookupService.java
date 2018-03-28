package org.unicef.rapidreg.service;

import org.unicef.rapidreg.model.Lookup;

import rx.Observable;

public interface LookupService {
    Observable<Lookup> getLookups(String cookie, String locale, Boolean getAll);

    void saveOrUpdate(Lookup lookup);
}
