<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ExecClusterDnsRequest extends Model
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

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 应用名列表
    /**
     * @var string[]
     */
    public $appNames;

    // dns域名的绑定/解绑
    /**
     * @var string
     */
    public $opsAction;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envId'             => 'env_id',
        'prodCode'          => 'prod_code',
        'appNames'          => 'app_names',
        'opsAction'         => 'ops_action',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appNames', $this->appNames, true);
        Model::validateRequired('opsAction', $this->opsAction, true);
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
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }
        if (null !== $this->opsAction) {
            $res['ops_action'] = $this->opsAction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecClusterDnsRequest
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
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['app_names'])) {
            if (!empty($map['app_names'])) {
                $model->appNames = $map['app_names'];
            }
        }
        if (isset($map['ops_action'])) {
            $model->opsAction = $map['ops_action'];
        }

        return $model;
    }
}
