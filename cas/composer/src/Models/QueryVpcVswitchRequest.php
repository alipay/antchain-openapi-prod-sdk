<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryVpcVswitchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // vpc paas id
    /**
     * @var string
     */
    public $vpcId;

    // vswitch iaas id
    /**
     * @var string
     */
    public $vswitchId;

    // 起始页，1为起点
    /**
     * @var int
     */
    public $pageNumber;

    // 最大50，默认值50
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'  => 'auth_token',
        'vpcId'      => 'vpc_id',
        'vswitchId'  => 'vswitch_id',
        'pageNumber' => 'page_number',
        'pageSize'   => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('vpcId', $this->vpcId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vswitchId) {
            $res['vswitch_id'] = $this->vswitchId;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryVpcVswitchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['vswitch_id'])) {
            $model->vswitchId = $map['vswitch_id'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
