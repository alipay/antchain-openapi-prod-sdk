<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class CallbackOrgoperationRepayRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 还款编号
    /**
     * @var string
     */
    public $repayRecordNo;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 扩展属性
    /**
     * @var string
     */
    public $extInfo;

    // 请求唯一id，最长32字符
    /**
     * @var string
     */
    public $requestUniqueId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'repayRecordNo'     => 'repay_record_no',
        'status'            => 'status',
        'extInfo'           => 'ext_info',
        'requestUniqueId'   => 'request_unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('repayRecordNo', $this->repayRecordNo, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('requestUniqueId', $this->requestUniqueId, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->repayRecordNo) {
            $res['repay_record_no'] = $this->repayRecordNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackOrgoperationRepayRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['repay_record_no'])) {
            $model->repayRecordNo = $map['repay_record_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }

        return $model;
    }
}
