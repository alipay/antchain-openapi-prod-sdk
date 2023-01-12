<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CmdTemplate extends Model
{
    // 指令模板定义的参数名称。比如：./install_env.sh --version 2.2，其中的 --version 就是参数名称（没有用到）
    /**
     * @example
     *
     * @var string[]
     */
    public $argNames;

    // 指令模板内容，可以为一个简单命令，也可是一个自定义脚本
    /**
     * @example
     *
     * @var string
     */
    public $content;

    // 指令模板创建者，通常为改用户注册蚂蚁金融云的email
    /**
     * @example
     *
     * @var string
     */
    public $creator;

    // 指令模板描述
    /**
     * @example
     *
     * @var string
     */
    public $description;

    // 在机器上执行该指令的账号，比如：root, admin
    /**
     * @example
     *
     * @var string
     */
    public $executeAccount;

    // 指令模板ID
    /**
     * @example
     *
     * @var string
     */
    public $id;

    // 指令名称
    /**
     * @example 无
     *
     * @var string
     */
    public $name;

    // 失败重试的间隔，单位为秒
    /**
     * @example
     *
     * @var int
     */
    public $retryInterval;

    // 失败重试次数
    /**
     * @example
     *
     * @var int
     */
    public $retryTimes;

    // 单次执行的超时时间，单位为秒
    /**
     * @example
     *
     * @var int
     */
    public $timeOut;

    // 模板类型。目前取值列表：
    // SIMPLE_COMMAND：简单指令类型；
    // CUSTOM_SHELL_SCRIPT：用户自定义shell脚本
    /**
     * @example
     *
     * @var string
     */
    public $type;

    // 脚本内容
    /**
     * @example bash
     *
     * @var string
     */
    public $script;

    // 指令模板id，genTimeSeriesId
    /**
     * @example xxx
     *
     * @var string
     */
    public $templateId;

    // 默认参数
    /**
     * @example xxx
     *
     * @var string
     */
    public $argument;

    // 脚本参数（json 字符串）
    /**
     * @example [{}]
     *
     * @var string
     */
    public $params;

    // 模板版本
    /**
     * @example 1
     *
     * @var int
     */
    public $templateVersion;

    // 模板类型
    /**
     * @example USER_DEFINED
     *
     * @var string
     */
    public $templateType;
    protected $_name = [
        'argNames'        => 'arg_names',
        'content'         => 'content',
        'creator'         => 'creator',
        'description'     => 'description',
        'executeAccount'  => 'execute_account',
        'id'              => 'id',
        'name'            => 'name',
        'retryInterval'   => 'retry_interval',
        'retryTimes'      => 'retry_times',
        'timeOut'         => 'time_out',
        'type'            => 'type',
        'script'          => 'script',
        'templateId'      => 'template_id',
        'argument'        => 'argument',
        'params'          => 'params',
        'templateVersion' => 'template_version',
        'templateType'    => 'template_type',
    ];

    public function validate()
    {
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->argNames) {
            $res['arg_names'] = $this->argNames;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->executeAccount) {
            $res['execute_account'] = $this->executeAccount;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->retryInterval) {
            $res['retry_interval'] = $this->retryInterval;
        }
        if (null !== $this->retryTimes) {
            $res['retry_times'] = $this->retryTimes;
        }
        if (null !== $this->timeOut) {
            $res['time_out'] = $this->timeOut;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->script) {
            $res['script'] = $this->script;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->argument) {
            $res['argument'] = $this->argument;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->templateVersion) {
            $res['template_version'] = $this->templateVersion;
        }
        if (null !== $this->templateType) {
            $res['template_type'] = $this->templateType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CmdTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['arg_names'])) {
            if (!empty($map['arg_names'])) {
                $model->argNames = $map['arg_names'];
            }
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['execute_account'])) {
            $model->executeAccount = $map['execute_account'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['retry_interval'])) {
            $model->retryInterval = $map['retry_interval'];
        }
        if (isset($map['retry_times'])) {
            $model->retryTimes = $map['retry_times'];
        }
        if (isset($map['time_out'])) {
            $model->timeOut = $map['time_out'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['script'])) {
            $model->script = $map['script'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['argument'])) {
            $model->argument = $map['argument'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['template_version'])) {
            $model->templateVersion = $map['template_version'];
        }
        if (isset($map['template_type'])) {
            $model->templateType = $map['template_type'];
        }

        return $model;
    }
}
