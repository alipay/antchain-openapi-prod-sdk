<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListUnifiedresourceVswitchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // region name
    /**
     * @var string
     */
    public $region;

    // 要查询的交换机所属VPC的ID
    /**
     * @var string
     */
    public $vpcId;

    // 要查询的交换机的ID
    /**
     * @var string
     */
    public $vSwitchId;

    // 最大50
    /**
     * @var int
     */
    public $pageSize;

    // 以1为起点
    /**
     * @var int
     */
    public $pageNumber;
    protected $_name = [
        'authToken'  => 'auth_token',
        'region'     => 'region',
        'vpcId'      => 'vpc_id',
        'vSwitchId'  => 'v_switch_id',
        'pageSize'   => 'page_size',
        'pageNumber' => 'page_number',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vSwitchId) {
            $res['v_switch_id'] = $this->vSwitchId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListUnifiedresourceVswitchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['v_switch_id'])) {
            $model->vSwitchId = $map['v_switch_id'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }

        return $model;
    }
}
