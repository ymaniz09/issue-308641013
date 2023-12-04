# issue-308641013

## Hedgehog 
Android Studio Hedgehog | 2023.1.1
Build #AI-231.9392.1.2311.11076708, built on November 9, 2023
Runtime version: 17.0.7+0-17.0.7b1000.6-10550314 aarch64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
macOS 13.5.2
GC: G1 Young Generation, G1 Old Generation
Memory: 2048M
Cores: 10
Metal Rendering is ON
Registry:
    external.system.auto.import.disabled=true
    debugger.new.tool.window.layout=true
    ide.text.editor.with.preview.show.floating.toolbar=false
    ide.instant.shutdown=false
    ide.experimental.ui=true

Non-Bundled Plugins:
    com.markskelton.one-dark-theme (5.9.0)
    com.github.copilot (1.4.3.3913)
    com.intellij.marketplace (231.9392.3)
    String Manipulation (9.12.0)
    Key Promoter X (2023.3.0)
    com.github.ragurney.spotless (2.0.0)
    izhangzhihao.rainbow.brackets (2023.3.7)

![Screenshot 2023-12-04 at 14 19 48](https://github.com/ymaniz09/issue-308641013/assets/9461790/cd6583e3-1227-40f3-a587-8a2dcdacc51a)

## Iguana
Android Studio Iguana | 2023.2.1 Canary 16
Build #AI-232.10227.8.2321.11161997, built on November 30, 2023
Runtime version: 17.0.9+0-17.0.9b1000.46-11084592 aarch64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
macOS 13.5.2
GC: G1 Young Generation, G1 Old Generation
Memory: 8192M
Cores: 10
Metal Rendering is ON
Registry:
    debugger.new.tool.window.layout=true
    ide.instant.shutdown=false
    ide.experimental.ui=true

Non-Bundled Plugins:
    com.markskelton.one-dark-theme (5.9.0)
    Statistic (4.2.7)
    com.github.copilot (1.4.3.3913)
    com.intellij.marketplace (232.10227.13)
    Key Promoter X (2023.3.0)
    Dart (232.10248)
    com.github.ragurney.spotless (2.0.0)
    wu.seal.tool.jsontokotlin (3.7.4)
    String Manipulation (9.12.0)
    izhangzhihao.rainbow.brackets (2023.3.7)
    io.flutter (76.3.4)
    
    
![Screenshot 2023-12-04 at 14 21 48](https://github.com/ymaniz09/issue-308641013/assets/9461790/343260f5-2308-4b09-b21c-88baf3dc30fd)


```
2023-12-04 14:21:08,318 [  14225]   WARN - #com.android.tools.preview.ParametrizedComposePreviewElementTemplate - Failed to instantiate com.music.myapplication.ui.preview.SearchReturnsScreenDataProvider parameter provider
java.lang.NoClassDefFoundError: android/os/Parcelable
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(Unknown Source)
	at java.base/java.lang.ClassLoader.defineClass(Unknown Source)
	at com.android.tools.rendering.classloading.loaders.DelegatingClassLoader.findClass(DelegatingClassLoader.kt:100)
	at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
	at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
	at com.android.tools.rendering.classloading.loaders.DelegatingClassLoader.loadClass(DelegatingClassLoader.kt:62)
	at java.base/java.lang.Class.getDeclaredMethods0(Native Method)
	at java.base/java.lang.Class.privateGetDeclaredMethods(Unknown Source)
	at java.base/java.lang.Class.privateGetPublicMethods(Unknown Source)
	at java.base/java.lang.Class.getMethods(Unknown Source)
	at com.android.tools.preview.ParametrizedComposePreviewElementTemplate.loadPreviewParameterProvider(ComposePreviewElement.kt:467)
	at com.android.tools.preview.ParametrizedComposePreviewElementTemplate.resolve(ComposePreviewElement.kt:455)
	at com.android.tools.idea.compose.ComposePreviewElementsModel$instantiatedPreviewElementsFlow$$inlined$map$1$2.emit(Emitters.kt:224)
	at com.android.tools.idea.compose.preview.flow.ComposePreviewFlowManager$initializeFlows$1$1$invokeSuspend$$inlined$map$1$2.emit(Emitters.kt:223)
	at kotlinx.coroutines.flow.DistinctFlowImpl$collect$2.emit(Distinct.kt:77)
	at kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(Channels.kt:37)
	at kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(Channels.kt:1)
	at kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1.invokeSuspend(Channels.kt)
	at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
	at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.base/java.util.concurrent.Executors$PrivilegedThreadFactory$1$1.run(Unknown Source)
	at java.base/java.util.concurrent.Executors$PrivilegedThreadFactory$1$1.run(Unknown Source)
	at java.base/java.security.AccessController.doPrivileged(Unknown Source)
	at java.base/java.util.concurrent.Executors$PrivilegedThreadFactory$1.run(Unknown Source)
	at java.base/java.lang.Thread.run(Unknown Source)
Caused by: java.lang.ClassNotFoundException: android.os.Parcelable
	at com.android.tools.rendering.classloading.loaders.DelegatingClassLoader.findClass(DelegatingClassLoader.kt:76)
	at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
	at java.base/java.lang.ClassLoader.loadClass(Unknown Source)
	at com.android.tools.rendering.classloading.loaders.DelegatingClassLoader.loadClass(DelegatingClassLoader.kt:62)
	... 28 more
```

```
2023-12-04 14:21:08,729 [  14636]   INFO - #com.google.services.firebase.insights.client.grpc.CrashlyticsGrpcClientImpl - App Quality Insights gRpc server connected at firebasecrashlytics.googleapis.com
2023-12-04 14:21:08,828 [  14735]   WARN - #c.i.o.m.LanguageLevelUtil - File not found: api22.txt
2023-12-04 14:21:08,948 [  14855]   INFO - #com.android.tools.idea.insights.events.actions.ActionDispatcher - Dispatching actions CancelFetches
2023-12-04 14:21:09,571 [  15478]   INFO - #c.i.o.a.i.PopupMenuPreloader - 9490 ms since showing to preload popup menu 'Editor Popup Menu' at 'EditorPopup(preload-bgt)' in 313 ms
2023-12-04 14:21:09,578 [  15485]   INFO - #c.i.o.a.i.PopupMenuPreloader - 9643 ms since showing to preload popup menu 'Editor Popup Menu' at 'EditorPopup(preload-bgt)' in 322 ms
2023-12-04 14:21:10,175 [  16082]   WARN - #com.android.tools.idea.uibuilder.scene.LayoutlibSceneManager - com.music.myapplication.ui.preview.SearchReturnsScreenDataProvider.$FailToLoadPreviewParameterProvider
java.lang.NoSuchMethodException: com.music.myapplication.ui.preview.SearchReturnsScreenDataProvider.$FailToLoadPreviewParameterProvider
	at androidx.compose.ui.tooling.ComposableInvoker.findComposableMethod(ComposableInvoker.kt:91)
	at androidx.compose.ui.tooling.ComposableInvoker.invokeComposable(ComposableInvoker.kt:198)
	at androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$composable$1.invoke(ComposeViewAdapter.kt:509)
	at androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$composable$1.invoke(ComposeViewAdapter.kt:507)
	at androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1.invoke(ComposeViewAdapter.kt:544)
	at androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1.invoke(ComposeViewAdapter.kt:502)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:108)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at androidx.compose.ui.tooling.InspectableKt.Inspectable(Inspectable.kt:61)
	at androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$1.invoke(ComposeViewAdapter.kt:449)
	at androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$1.invoke(ComposeViewAdapter.kt:448)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:108)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview(ComposeViewAdapter.kt:443)
	at androidx.compose.ui.tooling.ComposeViewAdapter.access$WrapPreview(ComposeViewAdapter.kt:127)
	at androidx.compose.ui.tooling.ComposeViewAdapter$init$3.invoke(ComposeViewAdapter.kt:502)
	at androidx.compose.ui.tooling.ComposeViewAdapter$init$3.invoke(ComposeViewAdapter.kt:499)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:108)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
	at androidx.compose.ui.platform.ComposeView.Content(ComposeView.android.kt:428)
	at androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1.invoke(ComposeView.android.kt:252)
	at androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1.invoke(ComposeView.android.kt:251)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:108)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at androidx.compose.ui.platform.CompositionLocalsKt.ProvideCommonCompositionLocals(CompositionLocals.kt:195)
	at androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3.invoke(AndroidCompositionLocals.android.kt:119)
	at androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3.invoke(AndroidCompositionLocals.android.kt:118)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:108)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(AndroidCompositionLocals.android.kt:110)
	at androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2.invoke(Wrapper.android.kt:158)
	at androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2.invoke(Wrapper.android.kt:157)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:108)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
	at androidx.compose.ui.platform.WrappedComposition$setContent$1$1.invoke(Wrapper.android.kt:157)
	at androidx.compose.ui.platform.WrappedComposition$setContent$1$1.invoke(Wrapper.android.kt:142)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:108)
	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
	at androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(ActualJvm.jvm.kt:78)
	at androidx.compose.runtime.ComposerImpl.doCompose(Composer.kt:3340)
	at androidx.compose.runtime.ComposerImpl.composeContent$runtime_release(Composer.kt:3273)
	at androidx.compose.runtime.CompositionImpl.composeContent(Composition.kt:588)
	at androidx.compose.runtime.Recomposer.composeInitial$runtime_release(Recomposer.kt:1013)
	at androidx.compose.runtime.CompositionImpl.setContent(Composition.kt:520)
	at androidx.compose.ui.platform.WrappedComposition$setContent$1.invoke(Wrapper.android.kt:142)
	at androidx.compose.ui.platform.WrappedComposition$setContent$1.invoke(Wrapper.android.kt:133)
	at androidx.compose.ui.platform.AndroidComposeView.setOnViewTreeOwnersAvailable(AndroidComposeView.android.kt:1191)
	at androidx.compose.ui.platform.WrappedComposition.setContent(Wrapper.android.kt:133)
	at androidx.compose.ui.platform.WrappedComposition.onStateChanged(Wrapper.android.kt:183)
	at androidx.lifecycle.LifecycleRegistry$ObserverWithState.dispatchEvent(LifecycleRegistry.kt:314)
	at androidx.lifecycle.LifecycleRegistry.addObserver(LifecycleRegistry.kt:192)
	at androidx.compose.ui.platform.WrappedComposition$setContent$1.invoke(Wrapper.android.kt:140)
	at androidx.compose.ui.platform.WrappedComposition$setContent$1.invoke(Wrapper.android.kt:133)
	at androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow(AndroidComposeView.android.kt:1266)
	at android.view.View.dispatchAttachedToWindow(View.java:21980)
	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3490)
	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3497)
	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3497)
	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3497)
	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3497)
	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3497)
	at android.view.AttachInfo_Accessor.setAttachInfo(AttachInfo_Accessor.java:44)
	at com.android.layoutlib.bridge.impl.RenderSessionImpl.inflate(RenderSessionImpl.java:372)
	at com.android.layoutlib.bridge.Bridge.createSession(Bridge.java:454)
	at com.android.tools.idea.layoutlib.LayoutLibrary.createSession(LayoutLibrary.java:120)
	at com.android.tools.rendering.RenderTask.createRenderSession(RenderTask.java:784)
	at com.android.tools.rendering.RenderTask.lambda$inflate$6(RenderTask.java:934)
	at com.android.tools.rendering.RenderExecutor$runAsyncActionWithTimeout$3.run(RenderExecutor.kt:202)
	at com.android.tools.rendering.RenderExecutor$PriorityRunnable.run(RenderExecutor.kt:316)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.base/java.lang.Thread.run(Unknown Source)
2023-12-04 14:21:10,955 [  16862]   INFO - #com.android.tools.idea.compose.preview.ComposePreviewView - Render completed
```

