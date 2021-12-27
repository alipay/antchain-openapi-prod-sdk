<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ExecSecurityRiskdataserviceRequest extends Model
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

    // 风险数据服务请求事件属性详情
    /**
     * @var string
     */
    public $eventInfo;

    // 反欺诈数据服务查询请求唯一凭证，为申请成功后得到，当请求类型是query时必填
    /**
     * @var string
     */
    public $riskDataServiaceApplyId;

    // 反欺诈风险数据服务请求类型（query or apply）
    /**
     * @var string
     */
    public $riskDataServiceType;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'eventInfo'               => 'event_info',
        'riskDataServiaceApplyId' => 'risk_data_serviace_apply_id',
        'riskDataServiceType'     => 'risk_data_service_type',
    ];

    public function validate()
    {
        Model::validateRequired('eventInfo', $this->eventInfo, true);
        Model::validateRequired('riskDataServiceType', $this->riskDataServiceType, true);
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
            $res['event_info'] = $this->eventInfo;
        }
        if (null !== $this->riskDataServiaceApplyId) {
            $res['risk_data_serviace_apply_id'] = $this->riskDataServiaceApplyId;
        }
        if (null !== $this->riskDataServiceType) {
            $res['risk_data_service_type'] = $this->riskDataServiceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecSecurityRiskdataserviceRequest
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
            $model->eventInfo = $map['event_info'];
        }
        if (isset($map['risk_data_serviace_apply_id'])) {
            $model->riskDataServiaceApplyId = $map['risk_data_serviace_apply_id'];
        }
        if (isset($map['risk_data_service_type'])) {
            $model->riskDataServiceType = $map['risk_data_service_type'];
        }

        return $model;
    }
}
