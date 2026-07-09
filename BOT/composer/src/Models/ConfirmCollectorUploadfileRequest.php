<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ConfirmCollectorUploadfileRequest extends Model
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

    // 上报文件任务ID，blockchain.bot.collector.uploadfileurl.create接口中获取
    /**
     * @var string
     */
    public $uploadId;

    // 上报数据的总数，用于和CSV文件中的数据进行核验
    /**
     * @var int
     */
    public $total;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'uploadId'          => 'upload_id',
        'total'             => 'total',
    ];

    public function validate()
    {
        Model::validateRequired('uploadId', $this->uploadId, true);
        Model::validateRequired('total', $this->total, true);
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
        if (null !== $this->uploadId) {
            $res['upload_id'] = $this->uploadId;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmCollectorUploadfileRequest
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
        if (isset($map['upload_id'])) {
            $model->uploadId = $map['upload_id'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
