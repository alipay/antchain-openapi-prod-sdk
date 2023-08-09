<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class SdkMavenDependencyInfo extends Model
{
    // client端maven依赖，包含蚂蚁链版本和金融云版本依赖信息
    /**
     * @example {"referenceClient":"<!-- 蚂蚁链客户端SDK -->
     * }
     * @var string
     */
    public $referenceClient;

    // 客户端server端依赖，产品api基于技术产品纬度使用技术客户端sdk构建，此处依赖基本使用不到
    /**
     * @example <dependency>
     * </dependency>
     * @var string
     */
    public $referencServer;

    // client端maven仓库地址
    /**
     * @example https://search.maven.org/artifact/com.antgroup.antchain.openapi/xxx/x.x.x/jar
     *
     * @var string
     */
    public $mavenLinkClient;

    // server端maven仓库地址
    /**
     * @example https://search.maven.org/artifact/com.antgroup.antchain.openapi/xxx/x.x.x/jar
     *
     * @var string
     */
    public $mavenLinkServer;
    protected $_name = [
        'referenceClient' => 'reference_client',
        'referencServer'  => 'referenc_server',
        'mavenLinkClient' => 'maven_link_client',
        'mavenLinkServer' => 'maven_link_server',
    ];

    public function validate()
    {
        Model::validateRequired('referenceClient', $this->referenceClient, true);
        Model::validateRequired('mavenLinkClient', $this->mavenLinkClient, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->referenceClient) {
            $res['reference_client'] = $this->referenceClient;
        }
        if (null !== $this->referencServer) {
            $res['referenc_server'] = $this->referencServer;
        }
        if (null !== $this->mavenLinkClient) {
            $res['maven_link_client'] = $this->mavenLinkClient;
        }
        if (null !== $this->mavenLinkServer) {
            $res['maven_link_server'] = $this->mavenLinkServer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SdkMavenDependencyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['reference_client'])) {
            $model->referenceClient = $map['reference_client'];
        }
        if (isset($map['referenc_server'])) {
            $model->referencServer = $map['referenc_server'];
        }
        if (isset($map['maven_link_client'])) {
            $model->mavenLinkClient = $map['maven_link_client'];
        }
        if (isset($map['maven_link_server'])) {
            $model->mavenLinkServer = $map['maven_link_server'];
        }

        return $model;
    }
}
