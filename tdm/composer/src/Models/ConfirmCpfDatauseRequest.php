<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class ConfirmCpfDatauseRequest extends Model
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

    // 验证端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 数据hash
    /**
     * @var string
     */
    public $dataHash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'terminalIdentity'  => 'terminal_identity',
        'dataHash'          => 'data_hash',
    ];

    public function validate()
    {
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('dataHash', $this->dataHash, true);
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
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->dataHash) {
            $res['data_hash'] = $this->dataHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmCpfDatauseRequest
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
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['data_hash'])) {
            $model->dataHash = $map['data_hash'];
        }

        return $model;
    }
}
