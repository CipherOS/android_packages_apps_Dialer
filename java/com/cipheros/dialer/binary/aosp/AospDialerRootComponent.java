/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.cipheros.dialer.binary.aosp;

import com.android.bubble.stub.StubBubbleModule;
import com.cipheros.dialer.activecalls.ActiveCallsModule;
import com.cipheros.dialer.binary.basecomponent.BaseDialerRootComponent;
import com.cipheros.dialer.calllog.CallLogModule;
import com.cipheros.dialer.calllog.config.CallLogConfigModule;
import com.cipheros.dialer.commandline.CommandLineModule;
import com.cipheros.dialer.common.concurrent.DialerExecutorModule;
import com.cipheros.dialer.configprovider.SharedPrefConfigProviderModule;
import com.cipheros.dialer.contacts.ContactsModule;
import com.cipheros.dialer.duo.stub.StubDuoModule;
import com.cipheros.dialer.enrichedcall.stub.StubEnrichedCallModule;
import com.cipheros.dialer.feedback.stub.StubFeedbackModule;
import com.cipheros.dialer.glidephotomanager.GlidePhotoManagerModule;
import com.cipheros.dialer.inject.ContextModule;
import com.cipheros.dialer.metrics.StubMetricsModule;
import com.cipheros.dialer.phonelookup.PhoneLookupModule;
import com.cipheros.dialer.phonenumbergeoutil.impl.PhoneNumberGeoUtilModule;
import com.cipheros.dialer.precall.impl.PreCallModule;
import com.cipheros.dialer.preferredsim.PreferredSimModule;
import com.cipheros.dialer.preferredsim.suggestion.stub.StubSimSuggestionModule;
import com.cipheros.dialer.promotion.impl.PromotionModule;
import com.cipheros.dialer.simulator.impl.SimulatorModule;
import com.cipheros.dialer.simulator.stub.StubSimulatorEnrichedCallModule;
import com.cipheros.dialer.spam.stub.StubSpamModule;
import com.cipheros.dialer.storage.StorageModule;
import com.cipheros.dialer.strictmode.impl.SystemStrictModeModule;
import com.cipheros.dialer.theme.base.impl.AospThemeModule;
import com.android.incallui.calllocation.stub.StubCallLocationModule;
import com.android.incallui.maps.stub.StubMapsModule;
import com.android.incallui.speakeasy.StubSpeakEasyModule;
import com.android.voicemail.impl.VoicemailModule;
import dagger.Component;
import javax.inject.Singleton;

/** Root component for the AOSP Dialer application. */
@Singleton
@Component(
    modules = {
      ActiveCallsModule.class,
      CallLogModule.class,
      CallLogConfigModule.class,
      CommandLineModule.class,
      ContactsModule.class,
      ContextModule.class,
      DialerExecutorModule.class,
      GlidePhotoManagerModule.class,
      PhoneLookupModule.class,
      PhoneNumberGeoUtilModule.class,
      PreCallModule.class,
      PreferredSimModule.class,
      PromotionModule.class,
      SharedPrefConfigProviderModule.class,
      SimulatorModule.class,
      StubSimulatorEnrichedCallModule.class,
      StorageModule.class,
      StubCallLocationModule.class,
      StubDuoModule.class,
      StubEnrichedCallModule.class,
      StubBubbleModule.class,
      StubMetricsModule.class,
      StubFeedbackModule.class,
      StubMapsModule.class,
      StubSimSuggestionModule.class,
      StubSpamModule.class,
      StubSpeakEasyModule.class,
      SystemStrictModeModule.class,
      AospThemeModule.class,
      VoicemailModule.class,
    })
public interface AospDialerRootComponent extends BaseDialerRootComponent {}
