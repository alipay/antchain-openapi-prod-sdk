<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyAppVo extends Model
{
    // 透明劫持配置
    /**
     * @example
     *
     * @var TransparentProxyAppConfig
     */
    public $appConfig;

    // 应用名称
    /**
     * @example app1
     *
     * @var string
     */
    public $appName;

    // 应用 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 租户实例 ID
    /**
     * @example 999999
     *
     * @var string
     */
    public $instanceId;

    // 节点数
    /**
     * @example 10
     *
     * @var int
     */
    public $nodeNum;

    // 打开透明劫持的节点数
    /**
     * @example 3
     *
     * @var int
     */
    public $openNum;

    // 运行透明劫持的节点数
    /**
     * @example 3
     *
     * @var int
     */
    public $runNum;

    // 应用支持的协议
    /**
     * @example
     *
     * @var TransparentProxyProtocolVo[]
     */
    public $supportProtocols;
    protected $_name = [
        'appConfig'        => 'app_config',
        'appName'          => 'app_name',
        'id'               => 'id',
        'instanceId'       => 'instance_id',
        'nodeNum'          => 'node_num',
        'openNum'          => 'open_num',
        'runNum'           => 'run_num',
        'supportProtocols' => 'support_protocols',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('nodeNum', $this->nodeNum, true);
        Model::validateRequired('openNum', $this->openNum, true);
        Model::validateRequired('runNum', $this->runNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appConfig) {
            $res['app_config'] = null !== $this->appConfig ? $this->appConfig->toMap() : null;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->nodeNum) {
            $res['node_num'] = $this->nodeNum;
        }
        if (null !== $this->openNum) {
            $res['open_num'] = $this->openNum;
        }
        if (null !== $this->runNum) {
            $res['run_num'] = $this->runNum;
        }
        if (null !== $this->supportProtocols) {
            $res['support_protocols'] = [];
            if (null !== $this->supportProtocols && \is_array($this->supportProtocols)) {
                $n = 0;
                foreach ($this->supportProtocols as $item) {
                    $res['support_protocols'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyAppVo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_config'])) {
            $model->appConfig = TransparentProxyAppConfig::fromMap($map['app_config']);
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['node_num'])) {
            $model->nodeNum = $map['node_num'];
        }
        if (isset($map['open_num'])) {
            $model->openNum = $map['open_num'];
        }
        if (isset($map['run_num'])) {
            $model->runNum = $map['run_num'];
        }
        if (isset($map['support_protocols'])) {
            if (!empty($map['support_protocols'])) {
                $model->supportProtocols = [];
                $n                       = 0;
                foreach ($map['support_protocols'] as $item) {
                    $model->supportProtocols[$n++] = null !== $item ? TransparentProxyProtocolVo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
