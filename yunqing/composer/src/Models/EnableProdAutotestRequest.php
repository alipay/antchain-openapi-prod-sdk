<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class EnableProdAutotestRequest extends Model
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
     * @var string[]
     */
    public $prodCodes;

    // READY("READY", "准备执行"), DEPLOYING("DEPLOYING", "部署中, 首次部署时的状态"),  UPGRADING("UPGRADING", "升级中, 首次部署时的状态"),      ROLL_BACKING("ROLL_BACKING", "回滚中, 包括产品回滚和应用回滚"),      ACTIVE("ACTIVE", "可用"),      FAILED("FAILED", "失败"),ROLLBACKED("ROLLBACKED", "已回滚"),APP_ROLLBACKED("APP_ROLLBACKED", "应用回滚")
    /**
     * @var string[]
     */
    public $prodStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envId'             => 'env_id',
        'prodCodes'         => 'prod_codes',
        'prodStatus'        => 'prod_status',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
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
        if (null !== $this->prodCodes) {
            $res['prod_codes'] = $this->prodCodes;
        }
        if (null !== $this->prodStatus) {
            $res['prod_status'] = $this->prodStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnableProdAutotestRequest
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
        if (isset($map['prod_codes'])) {
            if (!empty($map['prod_codes'])) {
                $model->prodCodes = $map['prod_codes'];
            }
        }
        if (isset($map['prod_status'])) {
            if (!empty($map['prod_status'])) {
                $model->prodStatus = $map['prod_status'];
            }
        }

        return $model;
    }
}
