<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryTdisaasairSecurityPolicyRequest extends Model
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

    // 风控事件咨询查询入参
    /**
     * @var EventInfo
     */
    public $eventInfo;

    // 请求处理方式
    //
    /**
     * @var string
     */
    public $riskType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'eventInfo'         => 'event_info',
        'riskType'          => 'risk_type',
    ];

    public function validate()
    {
        Model::validateRequired('eventInfo', $this->eventInfo, true);
        Model::validateRequired('riskType', $this->riskType, true);
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
        if (null !== $this->eventInfo) {
            $res['event_info'] = null !== $this->eventInfo ? $this->eventInfo->toMap() : null;
        }
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTdisaasairSecurityPolicyRequest
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
        if (isset($map['event_info'])) {
            $model->eventInfo = EventInfo::fromMap($map['event_info']);
        }
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }

        return $model;
    }
}
