<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SendNotaryTransactionTextRequest extends Model
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

    // 存证元数据
    /**
     * @var NotaryMetaParam
     */
    public $meta;

    // 存证内容
    /**
     * @var string
     */
    public $notaryContent;

    // 是否使用可信时间戳
    /**
     * @var bool
     */
    public $tsr;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'meta'              => 'meta',
        'notaryContent'     => 'notary_content',
        'tsr'               => 'tsr',
    ];

    public function validate()
    {
        Model::validateRequired('meta', $this->meta, true);
        Model::validateRequired('notaryContent', $this->notaryContent, true);
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
        if (null !== $this->meta) {
            $res['meta'] = null !== $this->meta ? $this->meta->toMap() : null;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendNotaryTransactionTextRequest
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
        if (isset($map['meta'])) {
            $model->meta = NotaryMetaParam::fromMap($map['meta']);
        }
        if (isset($map['notary_content'])) {
            $model->notaryContent = $map['notary_content'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }

        return $model;
    }
}
