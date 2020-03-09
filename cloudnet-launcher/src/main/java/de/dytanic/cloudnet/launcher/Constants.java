package de.dytanic.cloudnet.launcher;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.dytanic.cloudnet.launcher.module.CloudNetModule;

import java.util.Arrays;
import java.util.List;

public final class Constants {

    public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();

    public static final List<CloudNetModule> DEFAULT_MODULES = Arrays.asList(
            new CloudNetModule("cloudnet-bridge", "cloudnet-bridge.jar"),
            new CloudNetModule("cloudnet-signs", "cloudnet-signs.jar"),
            new CloudNetModule("cloudnet-syncproxy", "cloudnet-syncproxy.jar"),
            new CloudNetModule("cloudnet-cloudflare", "cloudnet-cloudflare.jar"),
            new CloudNetModule("cloudnet-report", "cloudnet-report.jar"),
            new CloudNetModule("cloudnet-rest", "cloudnet-rest.jar"),
            new CloudNetModule("cloudnet-smart", "cloudnet-smart.jar"),
            new CloudNetModule("cloudnet-cloudperms", "cloudnet-cloudperms.jar"),
            new CloudNetModule("cloudnet-storage-ftp", "cloudnet-storage-ftp.jar"),
            new CloudNetModule("cloudnet-database-mysql", "cloudnet-database-mysql.jar")
    );

    public static final String[] VERSION_FILE_NAMES = new String[]{
            "cloudnet.jar",
            "cloudnet.cnl",
            "driver.jar",
            "driver.cnl"
    };

    public static final String
            CLOUDNET_SELECTED_VERSION = "cloudnet.launcher.select.version",
            LAUNCHER_DEV_MODE = "cloudnet.launcher.dev-mode",
            CLOUDNET_REPOSITORY = "cloudnet.repository",
            CLOUDNET_REPOSITORY_GITHUB = "cloudnet.repository.github",
            CLOUDNET_REPOSITORY_AUTO_UPDATE = "cloudnet.auto-update",
            FALLBACK_VERSION = Constants.class.getPackage().getSpecificationVersion(),
            CLOUDNET_SNAPSHOTS = "cloudnet.snapshots.use-snapshots",
            CLOUDNET_SNAPSHOTS_JOB_URL = "cloudnet.snapshots.job.url";

    private Constants() {
        throw new UnsupportedOperationException();
    }

}