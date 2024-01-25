<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryAcopmTestobjectTestsubRequest extends Model
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

    // consumerId
    /**
     * @var string
     */
    public $consumerid;

    // originMsgId
    /**
     * @var string
     */
    public $originmsgid;

    // prodCode
    /**
     * @var string
     */
    public $prodcode;

    // msgSource
    /**
     * @var string
     */
    public $msgsource;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'consumerid'        => 'consumerid',
        'originmsgid'       => 'originmsgid',
        'prodcode'          => 'prodcode',
        'msgsource'         => 'msgsource',
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
        if (null !== $this->consumerid) {
            $res['consumerid'] = $this->consumerid;
        }
        if (null !== $this->originmsgid) {
            $res['originmsgid'] = $this->originmsgid;
        }
        if (null !== $this->prodcode) {
            $res['prodcode'] = $this->prodcode;
        }
        if (null !== $this->msgsource) {
            $res['msgsource'] = $this->msgsource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAcopmTestobjectTestsubRequest
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
        if (isset($map['consumerid'])) {
            $model->consumerid = $map['consumerid'];
        }
        if (isset($map['originmsgid'])) {
            $model->originmsgid = $map['originmsgid'];
        }
        if (isset($map['prodcode'])) {
            $model->prodcode = $map['prodcode'];
        }
        if (isset($map['msgsource'])) {
            $model->msgsource = $map['msgsource'];
        }

        return $model;
    }
}
