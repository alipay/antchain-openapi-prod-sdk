<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryDeepsecRiskRequest extends Model
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

    // 区分不同应用
    /**
     * @var string
     */
    public $appName;

    // app_key
    /**
     * @var string
     */
    public $appKey;

    // 业务数据集合，包括业务数据如zimId，Map<String,String>
    /**
     * @var string
     */
    public $bizData;

    // 风险数据集合，包括加密的R风险数据、设备染色数据，Map<String, String>
    /**
     * @var string
     */
    public $riskData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'appKey'            => 'app_key',
        'bizData'           => 'biz_data',
        'riskData'          => 'risk_data',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('bizData', $this->bizData, true);
        Model::validateRequired('riskData', $this->riskData, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appKey) {
            $res['app_key'] = $this->appKey;
        }
        if (null !== $this->bizData) {
            $res['biz_data'] = $this->bizData;
        }
        if (null !== $this->riskData) {
            $res['risk_data'] = $this->riskData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeepsecRiskRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_key'])) {
            $model->appKey = $map['app_key'];
        }
        if (isset($map['biz_data'])) {
            $model->bizData = $map['biz_data'];
        }
        if (isset($map['risk_data'])) {
            $model->riskData = $map['risk_data'];
        }

        return $model;
    }
}
