<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateResourceVpcResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 创建VPC后，系统自动创建的路由表的ID。
    /**
     * @var string
     */
    public $routeTableId;

    // 创建的VPC的ID
    /**
     * @var string
     */
    public $vpcId;

    // 创建VPC后，系统自动创建的路由器的ID。
    /**
     * @var string
     */
    public $vRouterId;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'routeTableId' => 'route_table_id',
        'vpcId'        => 'vpc_id',
        'vRouterId'    => 'v_router_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->routeTableId) {
            $res['route_table_id'] = $this->routeTableId;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vRouterId) {
            $res['v_router_id'] = $this->vRouterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateResourceVpcResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['route_table_id'])) {
            $model->routeTableId = $map['route_table_id'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['v_router_id'])) {
            $model->vRouterId = $map['v_router_id'];
        }

        return $model;
    }
}
