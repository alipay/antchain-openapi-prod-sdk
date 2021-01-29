<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsCmd;
use AntChain\Deps\Models\Computer;

class CreateComputeropsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'cmds' => 'cmds',
        'computers' => 'computers',
        'title' => 'title',
    ];
    public function validate() {
        Model::validateRequired('title', $this->title, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->cmds) {
            $res['cmds'] = [];
            if(null !== $this->cmds && is_array($this->cmds)){
                $n = 0;
                foreach($this->cmds as $item){
                    $res['cmds'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateComputeropsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['cmds'])){
            if(!empty($map['cmds'])){
                $model->cmds = [];
                $n = 0;
                foreach($map['cmds'] as $item) {
                    $model->cmds[$n++] = null !== $item ? OpsCmd::fromMap($item) : $item;
                }
            }
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
        if(isset($map['title'])){
            $model->title = $map['title'];
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

    // 执行的指令列表。n代表第n个指令，n从1开始，最大20。示例如下：cmds.1.template_id=000015678&cmds.1.args.1.name=--version&cmds.1.args.1.value=2.2&cmds.2.template_id=000015688
    /**
     * @var OpsCmd[]
     */
    public $cmds;

    // 执行运维操作的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
    /**
     * @var Computer[]
     */
    public $computers;

    // 运维单标题。长度不超过50个UTF-8字符
    /**
     * @var string
     */
    public $title;

}
