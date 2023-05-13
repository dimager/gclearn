package com.mager.app.gclearn;

import com.google.cloud.spring.core.GcpEnvironment;
import com.google.cloud.spring.core.GcpEnvironmentProvider;
import org.springframework.beans.factory.annotation.Autowired;

public class GCPSettings {
    @Autowired
    GcpEnvironmentProvider gcpEnvironmentProvider;

    @Autowired
    GCPSettings settings;


}
