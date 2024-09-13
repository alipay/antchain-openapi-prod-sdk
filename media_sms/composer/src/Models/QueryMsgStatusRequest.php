<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class QueryMsgStatusRequest extends Model
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

    // 创建批量发送任务
    // 时返回的批量发送
    // 任务id
    /**
     * @var string
     */
    public $batchTaskId;

    // 手机号列表
    /**
     * @var string[]
     */
    public $phoneNoList;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 拓展信息
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchTaskId'       => 'batch_task_id',
        'phoneNoList'       => 'phone_no_list',
        'tenantId'          => 'tenant_id',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('batchTaskId', $this->batchTaskId, true);
        Model::validateRequired('phoneNoList', $this->phoneNoList, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->batchTaskId) {
            $res['batch_task_id'] = $this->batchTaskId;
        }
        if (null !== $this->phoneNoList) {
            $res['phone_no_list'] = $this->phoneNoList;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMsgStatusRequest
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
        if (isset($map['batch_task_id'])) {
            $model->batchTaskId = $map['batch_task_id'];
        }
        if (isset($map['phone_no_list'])) {
            if (!empty($map['phone_no_list'])) {
                $model->phoneNoList = $map['phone_no_list'];
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
