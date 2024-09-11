package com.krishna.blitzai;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import com.krishna.blitzai.database.AppDatabase;
import com.krishna.blitzai.di.CoilModule;
import com.krishna.blitzai.di.GsonModule;
import com.krishna.blitzai.di.GsonModule_ProvideGsonFactory;
import com.krishna.blitzai.di.OkHttpModule;
import com.krishna.blitzai.di.OkHttpModule_ProvideOkHttpClientFactory;
import com.krishna.blitzai.di.RetrofitModule;
import com.krishna.blitzai.di.RetrofitModule_ProvideOpenAIServiceFactory;
import com.krishna.blitzai.di.RoomModule;
import com.krishna.blitzai.di.RoomModule_ProvideRoomDatabaseFactory;
import com.krishna.blitzai.di.viewmodel.ChatViewModelModule;
import com.krishna.blitzai.repository.network.OpenAIRepository;
import com.krishna.blitzai.repository.network.interceptor.AuthenticationInterceptor;
import com.krishna.blitzai.repository.network.interceptor.ChangeEndpointInterceptor;
import com.krishna.blitzai.repository.network.service.OpenAIService;
import com.krishna.blitzai.store.datastore.SettingsDataStore;
import com.krishna.blitzai.ui.activity.MainActivity;
import com.krishna.blitzai.viewmodel.ChatViewModel;
import com.krishna.blitzai.viewmodel.ChatViewModel_Factory;
import com.krishna.blitzai.viewmodel.ChatViewModel_HiltModules_KeyModule_ProvideFactory;
import com.krishna.blitzai.viewmodel.ChatsViewModel;
import com.krishna.blitzai.viewmodel.ChatsViewModel_Factory;
import com.krishna.blitzai.viewmodel.ChatsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.krishna.blitzai.viewmodel.MainViewModel;
import com.krishna.blitzai.viewmodel.MainViewModel_Factory;
import com.krishna.blitzai.viewmodel.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.krishna.blitzai.viewmodel.SettingsViewModel;
import com.krishna.blitzai.viewmodel.SettingsViewModel_Factory;
import com.krishna.blitzai.viewmodel.SettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.krishna.blitzai.viewmodel.SetupViewModel;
import com.krishna.blitzai.viewmodel.SetupViewModel_Factory;
import com.krishna.blitzai.viewmodel.SetupViewModel_HiltModules_KeyModule_ProvideFactory;
import com.krishna.blitzai.viewmodel.base.BaseViewModel_MembersInjector;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerBlitzAI_HiltComponents_SingletonC {
  private DaggerBlitzAI_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder coilModule(CoilModule coilModule) {
      Preconditions.checkNotNull(coilModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder gsonModule(GsonModule gsonModule) {
      Preconditions.checkNotNull(gsonModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder okHttpModule(OkHttpModule okHttpModule) {
      Preconditions.checkNotNull(okHttpModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder retrofitModule(RetrofitModule retrofitModule) {
      Preconditions.checkNotNull(retrofitModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder roomModule(RoomModule roomModule) {
      Preconditions.checkNotNull(roomModule);
      return this;
    }

    public BlitzAI_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements BlitzAI_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public BlitzAI_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements BlitzAI_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public BlitzAI_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements BlitzAI_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public BlitzAI_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements BlitzAI_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public BlitzAI_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements BlitzAI_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public BlitzAI_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements BlitzAI_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public BlitzAI_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements BlitzAI_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public BlitzAI_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends BlitzAI_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends BlitzAI_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends BlitzAI_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends BlitzAI_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(5).add(ChatViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ChatsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SetupViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends BlitzAI_HiltComponents.ViewModelC {
    private final SavedStateHandle savedStateHandle;

    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<Long> provideChatIdProvider;

    private Provider<ChatViewModel> chatViewModelProvider;

    private Provider<ChatsViewModel> chatsViewModelProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<SettingsViewModel> settingsViewModelProvider;

    private Provider<SetupViewModel> setupViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.savedStateHandle = savedStateHandleParam;
      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.provideChatIdProvider = DoubleCheck.provider(new SwitchingProvider<Long>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1));
      this.chatViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.chatsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.mainViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.settingsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.setupViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(5).put("com.krishna.blitzai.viewmodel.ChatViewModel", ((Provider) chatViewModelProvider)).put("com.krishna.blitzai.viewmodel.ChatsViewModel", ((Provider) chatsViewModelProvider)).put("com.krishna.blitzai.viewmodel.MainViewModel", ((Provider) mainViewModelProvider)).put("com.krishna.blitzai.viewmodel.SettingsViewModel", ((Provider) settingsViewModelProvider)).put("com.krishna.blitzai.viewmodel.SetupViewModel", ((Provider) setupViewModelProvider)).build();
    }

    private ChatViewModel injectChatViewModel(ChatViewModel instance) {
      BaseViewModel_MembersInjector.injectGson(instance, singletonCImpl.provideGsonProvider.get());
      return instance;
    }

    private ChatsViewModel injectChatsViewModel(ChatsViewModel instance) {
      BaseViewModel_MembersInjector.injectGson(instance, singletonCImpl.provideGsonProvider.get());
      return instance;
    }

    private MainViewModel injectMainViewModel(MainViewModel instance) {
      BaseViewModel_MembersInjector.injectGson(instance, singletonCImpl.provideGsonProvider.get());
      return instance;
    }

    private SettingsViewModel injectSettingsViewModel(SettingsViewModel instance) {
      BaseViewModel_MembersInjector.injectGson(instance, singletonCImpl.provideGsonProvider.get());
      return instance;
    }

    private SetupViewModel injectSetupViewModel(SetupViewModel instance) {
      BaseViewModel_MembersInjector.injectGson(instance, singletonCImpl.provideGsonProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.krishna.blitzai.viewmodel.ChatViewModel 
          return (T) viewModelCImpl.injectChatViewModel(ChatViewModel_Factory.newInstance(viewModelCImpl.provideChatIdProvider.get(), singletonCImpl.provideRoomDatabaseProvider.get(), singletonCImpl.openAIRepositoryProvider.get(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule)));

          case 1: // @com.krishna.blitzai.di.viewmodel.ChatId java.lang.Long 
          return (T) (Long) ChatViewModelModule.INSTANCE.provideChatId(viewModelCImpl.savedStateHandle);

          case 2: // com.krishna.blitzai.viewmodel.ChatsViewModel 
          return (T) viewModelCImpl.injectChatsViewModel(ChatsViewModel_Factory.newInstance(singletonCImpl.provideRoomDatabaseProvider.get(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule)));

          case 3: // com.krishna.blitzai.viewmodel.MainViewModel 
          return (T) viewModelCImpl.injectMainViewModel(MainViewModel_Factory.newInstance(singletonCImpl.settingsDataStoreProvider.get(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule)));

          case 4: // com.krishna.blitzai.viewmodel.SettingsViewModel 
          return (T) viewModelCImpl.injectSettingsViewModel(SettingsViewModel_Factory.newInstance(singletonCImpl.settingsDataStoreProvider.get(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule)));

          case 5: // com.krishna.blitzai.viewmodel.SetupViewModel 
          return (T) viewModelCImpl.injectSetupViewModel(SetupViewModel_Factory.newInstance(singletonCImpl.settingsDataStoreProvider.get(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule)));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends BlitzAI_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends BlitzAI_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends BlitzAI_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<AppDatabase> provideRoomDatabaseProvider;

    private Provider<SettingsDataStore> settingsDataStoreProvider;

    private Provider<AuthenticationInterceptor> authenticationInterceptorProvider;

    private Provider<ChangeEndpointInterceptor> changeEndpointInterceptorProvider;

    private Provider<OkHttpClient> provideOkHttpClientProvider;

    private Provider<Gson> provideGsonProvider;

    private Provider<OpenAIService> provideOpenAIServiceProvider;

    private Provider<OpenAIRepository> openAIRepositoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideRoomDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<AppDatabase>(singletonCImpl, 0));
      this.settingsDataStoreProvider = DoubleCheck.provider(new SwitchingProvider<SettingsDataStore>(singletonCImpl, 5));
      this.authenticationInterceptorProvider = DoubleCheck.provider(new SwitchingProvider<AuthenticationInterceptor>(singletonCImpl, 4));
      this.changeEndpointInterceptorProvider = DoubleCheck.provider(new SwitchingProvider<ChangeEndpointInterceptor>(singletonCImpl, 6));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 3));
      this.provideGsonProvider = DoubleCheck.provider(new SwitchingProvider<Gson>(singletonCImpl, 7));
      this.provideOpenAIServiceProvider = DoubleCheck.provider(new SwitchingProvider<OpenAIService>(singletonCImpl, 2));
      this.openAIRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<OpenAIRepository>(singletonCImpl, 1));
    }

    @Override
    public void injectBlitzAI(BlitzAI blitzAI) {
      injectBlitzAI2(blitzAI);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private BlitzAI injectBlitzAI2(BlitzAI instance) {
      BlitzAI_MembersInjector.injectDatabase(instance, provideRoomDatabaseProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.krishna.blitzai.database.AppDatabase 
          return (T) RoomModule_ProvideRoomDatabaseFactory.provideRoomDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 1: // com.krishna.blitzai.repository.network.OpenAIRepository 
          return (T) new OpenAIRepository(singletonCImpl.provideOpenAIServiceProvider.get(), singletonCImpl.settingsDataStoreProvider.get(), singletonCImpl.provideGsonProvider.get());

          case 2: // com.krishna.blitzai.repository.network.service.OpenAIService 
          return (T) RetrofitModule_ProvideOpenAIServiceFactory.provideOpenAIService(singletonCImpl.provideOkHttpClientProvider.get(), singletonCImpl.provideGsonProvider.get());

          case 3: // okhttp3.OkHttpClient 
          return (T) OkHttpModule_ProvideOkHttpClientFactory.provideOkHttpClient(singletonCImpl.authenticationInterceptorProvider.get(), singletonCImpl.changeEndpointInterceptorProvider.get());

          case 4: // com.krishna.blitzai.repository.network.interceptor.AuthenticationInterceptor 
          return (T) new AuthenticationInterceptor(singletonCImpl.settingsDataStoreProvider.get());

          case 5: // com.krishna.blitzai.store.datastore.SettingsDataStore 
          return (T) new SettingsDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 6: // com.krishna.blitzai.repository.network.interceptor.ChangeEndpointInterceptor 
          return (T) new ChangeEndpointInterceptor(singletonCImpl.settingsDataStoreProvider.get());

          case 7: // com.google.gson.Gson 
          return (T) GsonModule_ProvideGsonFactory.provideGson();

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
