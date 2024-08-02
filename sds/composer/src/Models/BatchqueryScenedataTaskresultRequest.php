<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryScenedataTaskresultRequest extends Model
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

    // 批次号
    /**
     * @var string
     */
    public $batchNo;

    // 游标，上一次的最后一条
    /**
     * @var string
     */
    public $cursor;

    // 本次同步数量
    /**
     * @var int
     */
    public $syncNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchNo'           => 'batch_no',
        'cursor'            => 'cursor',
        'syncNum'           => 'sync_num',
    ];

    public function validate()
    {
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateMaxLength('batchNo', $this->batchNo, 64);
        Model::validateMaxLength('cursor', $this->cursor, 256);
        Model::validateMaximum('syncNum', $this->syncNum, 100);
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
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->cursor) {
            $res['cursor'] = $this->cursor;
        }
        if (null !== $this->syncNum) {
            $res['sync_num'] = $this->syncNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryScenedataTaskresultRequest
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
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['cursor'])) {
            $model->cursor = $map['cursor'];
        }
        if (isset($map['sync_num'])) {
            $model->syncNum = $map['sync_num'];
        }

        return $model;
    }
}
