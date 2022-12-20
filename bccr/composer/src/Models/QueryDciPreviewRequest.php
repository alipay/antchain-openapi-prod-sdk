<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDciPreviewRequest extends Model
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

    // dci作品预览id
    /**
     * @var string
     */
    public $dciPreviewId;

    // basis的dci content id
    /**
     * @var string
     */
    public $dciBasisId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dciPreviewId'      => 'dci_preview_id',
        'dciBasisId'        => 'dci_basis_id',
    ];

    public function validate()
    {
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
        if (null !== $this->dciPreviewId) {
            $res['dci_preview_id'] = $this->dciPreviewId;
        }
        if (null !== $this->dciBasisId) {
            $res['dci_basis_id'] = $this->dciBasisId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDciPreviewRequest
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
        if (isset($map['dci_preview_id'])) {
            $model->dciPreviewId = $map['dci_preview_id'];
        }
        if (isset($map['dci_basis_id'])) {
            $model->dciBasisId = $map['dci_basis_id'];
        }

        return $model;
    }
}
