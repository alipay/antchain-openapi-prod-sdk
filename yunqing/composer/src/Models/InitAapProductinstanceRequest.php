<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class InitAapProductinstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 命名空间，命名格式：siteCode-prodCode （小写）
    /**
     * @var string
     */
    public $namespace;

    // 产品实例名称，推荐产品code的小写字母
    /**
     * @var string
     */
    public $name;

    // 产品code
    /**
     * @var string
     */
    public $prodCode;

    // 产品版本
    /**
     * @var string
     */
    public $prodVersion;

    // 产品部署的拓扑名称，部署时会根据该信息进行部署
    /**
     * @var string
     */
    public $topologyCode;

    // 站点code
    /**
     * @var string
     */
    public $siteCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'namespace'         => 'namespace',
        'name'              => 'name',
        'prodCode'          => 'prod_code',
        'prodVersion'       => 'prod_version',
        'topologyCode'      => 'topology_code',
        'siteCode'          => 'site_code',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('prodVersion', $this->prodVersion, true);
        Model::validateRequired('topologyCode', $this->topologyCode, true);
        Model::validateRequired('siteCode', $this->siteCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->prodVersion) {
            $res['prod_version'] = $this->prodVersion;
        }
        if (null !== $this->topologyCode) {
            $res['topology_code'] = $this->topologyCode;
        }
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAapProductinstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['prod_version'])) {
            $model->prodVersion = $map['prod_version'];
        }
        if (isset($map['topology_code'])) {
            $model->topologyCode = $map['topology_code'];
        }
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
        }

        return $model;
    }
}
