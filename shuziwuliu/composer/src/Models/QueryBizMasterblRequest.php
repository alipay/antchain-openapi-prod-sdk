<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryBizMasterblRequest extends Model
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

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // master提单号
    /**
     * @var string
     */
    public $masterBlNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'forwarderDid'      => 'forwarder_did',
        'masterBlNo'        => 'master_bl_no',
    ];

    public function validate()
    {
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('masterBlNo', $this->masterBlNo, true);
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
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->masterBlNo) {
            $res['master_bl_no'] = $this->masterBlNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBizMasterblRequest
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
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['master_bl_no'])) {
            $model->masterBlNo = $map['master_bl_no'];
        }

        return $model;
    }
}
