<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsCmd;
use AntChain\Deps\Models\OpsComputer;

class AsyncexecuteCmdTaskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'cmd' => 'cmd',
        'computers' => 'computers',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cmd) {
            $res['cmd'] = null !== $this->cmd ? $this->cmd->toMap() : null;
        }
        if (null !== $this->computers) {
            $res['computers'] = [];
            if(null !== $this->computers && is_array($this->computers)){
                $n = 0;
                foreach($this->computers as $item){
                    $res['computers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AsyncexecuteCmdTaskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['cmd'])){
            $model->cmd = OpsCmd::fromMap($map['cmd']);
        }
        if(isset($map['computers'])){
            if(!empty($map['computers'])){
                $model->computers = [];
                $n = 0;
                foreach($map['computers'] as $item) {
                    $model->computers[$n++] = null !== $item ? OpsComputer::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 执行的指令。示例如下：cmd.template_id=000015678&cmd.args.1.name=--version&cmd.args.1.value=2.2
    /**
     * @var OpsCmd
     */
    public $cmd;

    // 执行指令的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    /**
     * @var OpsComputer[]
     */
    public $computers;

}
