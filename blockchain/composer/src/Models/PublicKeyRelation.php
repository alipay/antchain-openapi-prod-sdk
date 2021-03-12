<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PublicKeyRelation extends Model
{
    // 公钥颁发者ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $issuerId;

    // 公钥接受者ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $recipientId;
    protected $_name = [
        'issuerId'    => 'issuer_id',
        'recipientId' => 'recipient_id',
    ];

    public function validate()
    {
        Model::validateRequired('issuerId', $this->issuerId, true);
        Model::validateRequired('recipientId', $this->recipientId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->issuerId) {
            $res['issuer_id'] = $this->issuerId;
        }
        if (null !== $this->recipientId) {
            $res['recipient_id'] = $this->recipientId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublicKeyRelation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['issuer_id'])) {
            $model->issuerId = $map['issuer_id'];
        }
        if (isset($map['recipient_id'])) {
            $model->recipientId = $map['recipient_id'];
        }

        return $model;
    }
}
