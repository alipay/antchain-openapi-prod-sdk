<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateRecordRequest extends Model
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

    // 批次id
    /**
     * @var string
     */
    public $batchId;

    // 执行记录数组
    /**
     * @var ReceivedRecord[]
     */
    public $receivedRecordList;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'batchId'            => 'batch_id',
        'receivedRecordList' => 'received_record_list',
    ];

    public function validate()
    {
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('receivedRecordList', $this->receivedRecordList, true);
        Model::validateMaxLength('batchId', $this->batchId, 50);
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->receivedRecordList) {
            $res['received_record_list'] = [];
            if (null !== $this->receivedRecordList && \is_array($this->receivedRecordList)) {
                $n = 0;
                foreach ($this->receivedRecordList as $item) {
                    $res['received_record_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateRecordRequest
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
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['received_record_list'])) {
            if (!empty($map['received_record_list'])) {
                $model->receivedRecordList = [];
                $n                         = 0;
                foreach ($map['received_record_list'] as $item) {
                    $model->receivedRecordList[$n++] = null !== $item ? ReceivedRecord::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
