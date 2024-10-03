/**
 * Precompiled [jadx-kotlin.gradle.kts][Jadx_kotlin_gradle] script plugin.
 *
 * @see Jadx_kotlin_gradle
 */
public
class JadxKotlinPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Jadx_kotlin_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
