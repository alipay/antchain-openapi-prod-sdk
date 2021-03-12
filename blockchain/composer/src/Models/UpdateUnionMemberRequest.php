<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateUnionMemberRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // member_name
    /**
     * @var string
     */
    public $memberName;

    // consortium_id
    /**
     * @var string
     */
    public $consortiumId;

    // member_id
    /**
     * @var string
     */
    public $memberId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionId'          => 'region_id',
        'memberName'        => 'member_name',
        'consortiumId'      => 'consortium_id',
        'memberId'          => 'member_id',
    ];

    public function validate()
    {
        Model::validateRequired('memberName', $this->memberName, true);
        Model::validateRequired('consortiumId', $this->consortiumId, true);
        Model::validateRequired('memberId', $this->memberId, true);
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
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->memberName) {
            $res['member_name'] = $this->memberName;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->memberId) {
            $res['member_id'] = $this->memberId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateUnionMemberRequest
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
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['member_name'])) {
            $model->memberName = $map['member_name'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['member_id'])) {
            $model->memberId = $map['member_id'];
        }

        return $model;
    }
}
