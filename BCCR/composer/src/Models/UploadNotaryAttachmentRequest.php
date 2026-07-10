<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class UploadNotaryAttachmentRequest extends Model
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

    // 订单ID
    /**
     * @var string
     */
    public $notaryOrderId;

    // 材料文件
    /**
     * @var string[]
     */
    public $materialFileList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'notaryOrderId'     => 'notary_order_id',
        'materialFileList'  => 'material_file_list',
    ];

    public function validate()
    {
        Model::validateRequired('notaryOrderId', $this->notaryOrderId, true);
        Model::validateRequired('materialFileList', $this->materialFileList, true);
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
        if (null !== $this->notaryOrderId) {
            $res['notary_order_id'] = $this->notaryOrderId;
        }
        if (null !== $this->materialFileList) {
            $res['material_file_list'] = $this->materialFileList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadNotaryAttachmentRequest
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
        if (isset($map['notary_order_id'])) {
            $model->notaryOrderId = $map['notary_order_id'];
        }
        if (isset($map['material_file_list'])) {
            if (!empty($map['material_file_list'])) {
                $model->materialFileList = $map['material_file_list'];
            }
        }

        return $model;
    }
}
