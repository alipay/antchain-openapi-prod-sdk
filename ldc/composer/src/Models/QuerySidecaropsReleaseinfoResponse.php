<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QuerySidecaropsReleaseinfoResponse extends Model
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

    // 所查询版本的实际sidecarConfig信息
    /**
     * @var SidecarConfig
     */
    public $sidecarConfig;

    // 应用服务名
    /**
     * @var string
     */
    public $containerServiceName;

    // sidecar模板的版本号，与应用无关
    /**
     * @var string
     */
    public $sidecarVersion;

    // 发布相关的应用参数，如feature等
    /**
     * @var string
     */
    public $param;

    // 发布所处状态
    /**
     * @var string
     */
    public $status;

    // 以时间戳生成的发布版本号
    /**
     * @var string
     */
    public $releaseVersion;

    // 上一个版本号
    /**
     * @var string
     */
    public $lastReleaseVersion;

    // 执行单号，调用方唯一确定一次发布的单号；
    /**
     * @var string
     */
    public $orderNum;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'sidecarConfig'        => 'sidecar_config',
        'containerServiceName' => 'container_service_name',
        'sidecarVersion'       => 'sidecar_version',
        'param'                => 'param',
        'status'               => 'status',
        'releaseVersion'       => 'release_version',
        'lastReleaseVersion'   => 'last_release_version',
        'orderNum'             => 'order_num',
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
        if (null !== $this->sidecarConfig) {
            $res['sidecar_config'] = null !== $this->sidecarConfig ? $this->sidecarConfig->toMap() : null;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->param) {
            $res['param'] = $this->param;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->releaseVersion) {
            $res['release_version'] = $this->releaseVersion;
        }
        if (null !== $this->lastReleaseVersion) {
            $res['last_release_version'] = $this->lastReleaseVersion;
        }
        if (null !== $this->orderNum) {
            $res['order_num'] = $this->orderNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySidecaropsReleaseinfoResponse
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
        if (isset($map['sidecar_config'])) {
            $model->sidecarConfig = SidecarConfig::fromMap($map['sidecar_config']);
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['param'])) {
            $model->param = $map['param'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['release_version'])) {
            $model->releaseVersion = $map['release_version'];
        }
        if (isset($map['last_release_version'])) {
            $model->lastReleaseVersion = $map['last_release_version'];
        }
        if (isset($map['order_num'])) {
            $model->orderNum = $map['order_num'];
        }

        return $model;
    }
}
