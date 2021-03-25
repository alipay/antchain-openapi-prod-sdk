<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Computer;

class AsyncexecuteBashcmdRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'command' => 'command',
        'computers' => 'computers',
        'timeOut' => 'time_out',
        'user' => 'user',
    ];
    public function validate() {
        Model::validateRequired('command', $this->command, true);
        Model::validateRequired('computers', $this->computers, true);
        Model::validateRequired('timeOut', $this->timeOut, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->command) {
            $res['command'] = $this->command;
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
        if (null !== $this->timeOut) {
            $res['time_out'] = $this->timeOut;
        }
        if (null !== $this->user) {
            $res['user'] = $this->user;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AsyncexecuteBashcmdRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['command'])){
            $model->command = $map['command'];
        }
        if(isset($map['computers'])){
            if(!empty($map['computers'])){
                $model->computers = [];
                $n = 0;
                foreach($map['computers'] as $item) {
                    $model->computers[$n++] = null !== $item ? Computer::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['time_out'])){
            $model->timeOut = $map['time_out'];
        }
        if(isset($map['user'])){
            $model->user = $map['user'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 执行的命令，长度不能超过500个字符
    /**
     * @var string
     */
    public $command;

    // 执行指令的目标机器id列表。n代表第n个机器，n从1开始，最大50。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    /**
     * @var Computer[]
     */
    public $computers;

    // 单次执行的超时时间，单位为秒。最大值为1800秒，默认值也为1800秒
    /**
     * @var int
     */
    public $timeOut;

    // 机器上执行命令的用户,比如：root,admin
    /**
     * @var string
     */
    public $user;

}
