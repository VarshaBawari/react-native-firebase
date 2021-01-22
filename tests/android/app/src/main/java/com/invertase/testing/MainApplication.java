package com.invertase.testing;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.devsupport.DevInternalSettings;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import io.invertase.jet.JetPackage;
import io.invertase.firebase.varsha.RNFirebasePackage;
import io.invertase.firebase.varsha.admob.RNFirebaseAdMobPackage;
import io.invertase.firebase.varsha.analytics.RNFirebaseAnalyticsPackage;
import io.invertase.firebase.varsha.auth.RNFirebaseAuthPackage;
import io.invertase.firebase.varsha.config.RNFirebaseRemoteConfigPackage;
import io.invertase.firebase.varsha.database.RNFirebaseDatabasePackage;
import io.invertase.firebase.varsha.fabric.crashlytics.RNFirebaseCrashlyticsPackage;
import io.invertase.firebase.varsha.firestore.RNFirebaseFirestorePackage;
import io.invertase.firebase.varsha.functions.RNFirebaseFunctionsPackage;
import io.invertase.firebase.varsha.instanceid.RNFirebaseInstanceIdPackage;
import io.invertase.firebase.varsha.links.RNFirebaseLinksPackage;
import io.invertase.firebase.varsha.messaging.RNFirebaseMessagingPackage;
import io.invertase.firebase.varsha.notifications.RNFirebaseNotificationsPackage;
import io.invertase.firebase.varsha.perf.RNFirebasePerformancePackage;
import io.invertase.firebase.varsha.storage.RNFirebaseStoragePackage;


import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
        new MainReactPackage(),
        new JetPackage(),
        new RNFirebasePackage(),
        new RNFirebaseAdMobPackage(),
        new RNFirebaseAnalyticsPackage(),
        new RNFirebaseAuthPackage(),
        new RNFirebaseRemoteConfigPackage(),
        new RNFirebaseCrashlyticsPackage(),
        new RNFirebaseDatabasePackage(),
        new RNFirebaseFirestorePackage(),
        new RNFirebaseFunctionsPackage(),
        new RNFirebaseInstanceIdPackage(),
        new RNFirebaseLinksPackage(),
        new RNFirebaseMessagingPackage(),
        new RNFirebaseNotificationsPackage(),
        new RNFirebasePerformancePackage(),
        new RNFirebaseStoragePackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();

    // TODO move to jet
    DevInternalSettings settings = (DevInternalSettings) getReactNativeHost().getReactInstanceManager().getDevSupportManager().getDevSettings();
    if (settings != null) {
      settings.setBundleDeltasEnabled(false);
    }

    SoLoader.init(this, /* native exopackage */ false);
  }

}
