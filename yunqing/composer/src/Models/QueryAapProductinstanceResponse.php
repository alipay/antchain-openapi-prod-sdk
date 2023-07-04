<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class QueryAapProductinstanceResponse extends Model
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

    // namespace
    /**
     * @var string
     */
    public $namespace;

    // prod code
    /**
     * @var string
     */
    public $prodCode;

    // 产品实例名称
    /**
     * @var string
     */
    public $name;

    // 产品版本
    /**
     * @var string
     */
    public $prodVersion;

    // 拓扑code
    /**
     * @var string
     */
    public $topologyCode;

    // 拓扑名称
    /**
     * @var string
     */
    public $topologyName;

    // 产品实例状态
    /**
     * @var string
     */
    public $status;

    // 应用实例列表
    /**
     * @var ApplicationMeta[]
     */
    public $appInstances;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'namespace'    => 'namespace',
        'prodCode'     => 'prod_code',
        'name'         => 'name',
        'prodVersion'  => 'prod_version',
        'topologyCode' => 'topology_code',
        'topologyName' => 'topology_name',
        'status'       => 'status',
        'appInstances' => 'app_instances',
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
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->prodVersion) {
            $res['prod_version'] = $this->prodVersion;
        }
        if (null !== $this->topologyCode) {
            $res['topology_code'] = $this->topologyCode;
        }
        if (null !== $this->topologyName) {
            $res['topology_name'] = $this->topologyName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->appInstances) {
            $res['app_instances'] = [];
            if (null !== $this->appInstances && \is_array($this->appInstances)) {
                $n = 0;
                foreach ($this->appInstances as $item) {
                    $res['app_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAapProductinstanceResponse
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
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['prod_version'])) {
            $model->prodVersion = $map['prod_version'];
        }
        if (isset($map['topology_code'])) {
            $model->topologyCode = $map['topology_code'];
        }
        if (isset($map['topology_name'])) {
            $model->topologyName = $map['topology_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['app_instances'])) {
            if (!empty($map['app_instances'])) {
                $model->appInstances = [];
                $n                   = 0;
                foreach ($map['app_instances'] as $item) {
                    $model->appInstances[$n++] = null !== $item ? ApplicationMeta::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
