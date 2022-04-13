// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodDNSConfig extends TeaModel {
    // A list of DNS name server IP addresses
    @NameInMap("nameservers")
    public java.util.List<String> nameservers;

    // A list of DNS resolver options. 
    @NameInMap("options")
    public java.util.List<PodDNSConfigOption> options;

    // A list of DNS search domains for host-name lookup
    @NameInMap("searches")
    @Validation(required = true)
    public java.util.List<String> searches;

    public static PodDNSConfig build(java.util.Map<String, ?> map) throws Exception {
        PodDNSConfig self = new PodDNSConfig();
        return TeaModel.build(map, self);
    }

    public PodDNSConfig setNameservers(java.util.List<String> nameservers) {
        this.nameservers = nameservers;
        return this;
    }
    public java.util.List<String> getNameservers() {
        return this.nameservers;
    }

    public PodDNSConfig setOptions(java.util.List<PodDNSConfigOption> options) {
        this.options = options;
        return this;
    }
    public java.util.List<PodDNSConfigOption> getOptions() {
        return this.options;
    }

    public PodDNSConfig setSearches(java.util.List<String> searches) {
        this.searches = searches;
        return this;
    }
    public java.util.List<String> getSearches() {
        return this.searches;
    }

}
