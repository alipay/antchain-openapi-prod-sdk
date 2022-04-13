<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LifecycleHook extends Model
{
    // 启动后执行命令。
    /**
     * @example {}
     *
     * @var ExecAction
     */
    public $postStartExec;

    // 启动后执行http get。
    /**
     * @example {}
     *
     * @var HttpGetAction
     */
    public $postStartHttp;

    // 启动后执行TCP请求。
    /**
     * @example {}
     *
     * @var TcpSocketAction
     */
    public $postStartTcp;

    // 停止前执行命令。
    /**
     * @example {}
     *
     * @var ExecAction
     */
    public $preStopExec;

    // 停止前http get。
    /**
     * @example {}
     *
     * @var HttpGetAction
     */
    public $preStopHttp;

    // 停止前TCP请求。
    /**
     * @example {}
     *
     * @var TcpSocketAction
     */
    public $preStopTcp;
    protected $_name = [
        'postStartExec' => 'post_start_exec',
        'postStartHttp' => 'post_start_http',
        'postStartTcp'  => 'post_start_tcp',
        'preStopExec'   => 'pre_stop_exec',
        'preStopHttp'   => 'pre_stop_http',
        'preStopTcp'    => 'pre_stop_tcp',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->postStartExec) {
            $res['post_start_exec'] = null !== $this->postStartExec ? $this->postStartExec->toMap() : null;
        }
        if (null !== $this->postStartHttp) {
            $res['post_start_http'] = null !== $this->postStartHttp ? $this->postStartHttp->toMap() : null;
        }
        if (null !== $this->postStartTcp) {
            $res['post_start_tcp'] = null !== $this->postStartTcp ? $this->postStartTcp->toMap() : null;
        }
        if (null !== $this->preStopExec) {
            $res['pre_stop_exec'] = null !== $this->preStopExec ? $this->preStopExec->toMap() : null;
        }
        if (null !== $this->preStopHttp) {
            $res['pre_stop_http'] = null !== $this->preStopHttp ? $this->preStopHttp->toMap() : null;
        }
        if (null !== $this->preStopTcp) {
            $res['pre_stop_tcp'] = null !== $this->preStopTcp ? $this->preStopTcp->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LifecycleHook
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['post_start_exec'])) {
            $model->postStartExec = ExecAction::fromMap($map['post_start_exec']);
        }
        if (isset($map['post_start_http'])) {
            $model->postStartHttp = HttpGetAction::fromMap($map['post_start_http']);
        }
        if (isset($map['post_start_tcp'])) {
            $model->postStartTcp = TcpSocketAction::fromMap($map['post_start_tcp']);
        }
        if (isset($map['pre_stop_exec'])) {
            $model->preStopExec = ExecAction::fromMap($map['pre_stop_exec']);
        }
        if (isset($map['pre_stop_http'])) {
            $model->preStopHttp = HttpGetAction::fromMap($map['pre_stop_http']);
        }
        if (isset($map['pre_stop_tcp'])) {
            $model->preStopTcp = TcpSocketAction::fromMap($map['pre_stop_tcp']);
        }

        return $model;
    }
}
