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

package com.cipheros.dialer.binary.basecomponent;

import com.android.bubble.BubbleComponent;
import com.cipheros.dialer.activecalls.ActiveCallsComponent;
import com.cipheros.dialer.calllog.CallLogComponent;
import com.cipheros.dialer.calllog.config.CallLogConfigComponent;
import com.cipheros.dialer.calllog.database.CallLogDatabaseComponent;
import com.cipheros.dialer.calllog.ui.CallLogUiComponent;
import com.cipheros.dialer.commandline.CommandLineComponent;
import com.cipheros.dialer.common.concurrent.DialerExecutorComponent;
import com.cipheros.dialer.configprovider.ConfigProviderComponent;
import com.cipheros.dialer.contacts.ContactsComponent;
import com.cipheros.dialer.duo.DuoComponent;
import com.cipheros.dialer.enrichedcall.EnrichedCallComponent;
import com.cipheros.dialer.feedback.FeedbackComponent;
import com.cipheros.dialer.glidephotomanager.GlidePhotoManagerComponent;
import com.cipheros.dialer.metrics.MetricsComponent;
import com.cipheros.dialer.phonelookup.PhoneLookupComponent;
import com.cipheros.dialer.phonelookup.database.PhoneLookupDatabaseComponent;
import com.cipheros.dialer.phonenumbergeoutil.PhoneNumberGeoUtilComponent;
import com.cipheros.dialer.precall.PreCallComponent;
import com.cipheros.dialer.preferredsim.PreferredSimComponent;
import com.cipheros.dialer.preferredsim.suggestion.SimSuggestionComponent;
import com.cipheros.dialer.promotion.PromotionComponent;
import com.cipheros.dialer.simulator.SimulatorComponent;
import com.cipheros.dialer.spam.SpamComponent;
import com.cipheros.dialer.speeddial.loader.UiItemLoaderComponent;
import com.cipheros.dialer.storage.StorageComponent;
import com.cipheros.dialer.strictmode.StrictModeComponent;
import com.cipheros.dialer.theme.base.ThemeComponent;
import com.android.incallui.calllocation.CallLocationComponent;
import com.android.incallui.maps.MapsComponent;
import com.android.incallui.speakeasy.SpeakEasyComponent;
import com.android.voicemail.VoicemailComponent;

/**
 * Base class for the core application-wide component. All variants of the Dialer app should extend
 * from this component.
 */
public interface BaseDialerRootComponent
    extends ActiveCallsComponent.HasComponent,
        BubbleComponent.HasComponent,
        CallLocationComponent.HasComponent,
        CallLogComponent.HasComponent,
        CallLogConfigComponent.HasComponent,
        CallLogDatabaseComponent.HasComponent,
        CallLogUiComponent.HasComponent,
        ConfigProviderComponent.HasComponent,
        CommandLineComponent.HasComponent,
        ContactsComponent.HasComponent,
        DialerExecutorComponent.HasComponent,
        DuoComponent.HasComponent,
        EnrichedCallComponent.HasComponent,
        FeedbackComponent.HasComponent,
        GlidePhotoManagerComponent.HasComponent,
        MapsComponent.HasComponent,
        MetricsComponent.HasComponent,
        PhoneLookupComponent.HasComponent,
        PhoneLookupDatabaseComponent.HasComponent,
        PhoneNumberGeoUtilComponent.HasComponent,
        PreCallComponent.HasComponent,
        PreferredSimComponent.HasComponent,
        PromotionComponent.HasComponent,
        UiItemLoaderComponent.HasComponent,
        SimSuggestionComponent.HasComponent,
        SimulatorComponent.HasComponent,
        SpamComponent.HasComponent,
        SpeakEasyComponent.HasComponent,
        StorageComponent.HasComponent,
        StrictModeComponent.HasComponent,
        ThemeComponent.HasComponent,
        VoicemailComponent.HasComponent {}
