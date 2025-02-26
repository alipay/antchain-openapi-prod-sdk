<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainBccrDciRegistrationsubmitRequest extends Model
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

    // dci内容id
    /**
     * @var string
     */
    public $dciContentId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dciContentId'      => 'dci_content_id',
    ];

    public function validate()
    {
        Model::validateRequired('dciContentId', $this->dciContentId, true);
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
        if (null !== $this->dciContentId) {
            $res['dci_content_id'] = $this->dciContentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainBccrDciRegistrationsubmitRequest
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
        if (isset($map['dci_content_id'])) {
            $model->dciContentId = $map['dci_content_id'];
        }

        return $model;
    }
}
