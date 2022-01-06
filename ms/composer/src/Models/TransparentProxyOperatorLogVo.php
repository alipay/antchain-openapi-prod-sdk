<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyOperatorLogVo extends Model
{
    // 日志 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 修改内容
    /**
     * @example 旧值 xx 新值 xx
     *
     * @var string
     */
    public $modifyContent;

    // 操作人
    /**
     * @example 小明
     *
     * @var string
     */
    public $modifyName;

    // 操作时间
    /**
     * @example 2020-03-25 02:01:08
     *
     * @var string
     */
    public $modifyTime;

    // 端口
    /**
     * @example 80
     *
     * @var int
     */
    public $port;
    protected $_name = [
        'id'            => 'id',
        'modifyContent' => 'modify_content',
        'modifyName'    => 'modify_name',
        'modifyTime'    => 'modify_time',
        'port'          => 'port',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('modifyContent', $this->modifyContent, true);
        Model::validateRequired('modifyName', $this->modifyName, true);
        Model::validateRequired('modifyTime', $this->modifyTime, true);
        Model::validateRequired('port', $this->port, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modifyContent) {
            $res['modify_content'] = $this->modifyContent;
        }
        if (null !== $this->modifyName) {
            $res['modify_name'] = $this->modifyName;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyOperatorLogVo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['modify_content'])) {
            $model->modifyContent = $map['modify_content'];
        }
        if (isset($map['modify_name'])) {
            $model->modifyName = $map['modify_name'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }

        return $model;
    }
}
