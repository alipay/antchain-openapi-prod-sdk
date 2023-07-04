<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class DetailAapApplicationinstanceResponse extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $name;

    // 镜像
    /**
     * @var string
     */
    public $image;

    // 副本数
    /**
     * @var int
     */
    public $replicas;

    // 容器详情
    /**
     * @var ContainerInstance[]
     */
    public $podInstances;

    // 应用版本
    /**
     * @var string
     */
    public $version;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'name'         => 'name',
        'image'        => 'image',
        'replicas'     => 'replicas',
        'podInstances' => 'pod_instances',
        'version'      => 'version',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->replicas) {
            $res['replicas'] = $this->replicas;
        }
        if (null !== $this->podInstances) {
            $res['pod_instances'] = [];
            if (null !== $this->podInstances && \is_array($this->podInstances)) {
                $n = 0;
                foreach ($this->podInstances as $item) {
                    $res['pod_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailAapApplicationinstanceResponse
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['replicas'])) {
            $model->replicas = $map['replicas'];
        }
        if (isset($map['pod_instances'])) {
            if (!empty($map['pod_instances'])) {
                $model->podInstances = [];
                $n                   = 0;
                foreach ($map['pod_instances'] as $item) {
                    $model->podInstances[$n++] = null !== $item ? ContainerInstance::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
