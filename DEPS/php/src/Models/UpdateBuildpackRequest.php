<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackParamTemplate;

class UpdateBuildpackRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'buildCommand' => 'build_command',
        'contactInfo' => 'contact_info',
        'debugMode' => 'debug_mode',
        'description' => 'description',
        'envParams' => 'env_params',
        'fullVersion' => 'full_version',
        'id' => 'id',
        'supportedOs' => 'supported_os',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->buildCommand) {
            $res['build_command'] = $this->buildCommand;
        }
        if (null !== $this->contactInfo) {
            $res['contact_info'] = $this->contactInfo;
        }
        if (null !== $this->debugMode) {
            $res['debug_mode'] = $this->debugMode;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->envParams) {
            $res['env_params'] = [];
            if(null !== $this->envParams && is_array($this->envParams)){
                $n = 0;
                foreach($this->envParams as $item){
                    $res['env_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fullVersion) {
            $res['full_version'] = $this->fullVersion;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->supportedOs) {
            $res['supported_os'] = $this->supportedOs;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBuildpackRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['build_command'])){
            $model->buildCommand = $map['build_command'];
        }
        if(isset($map['contact_info'])){
            $model->contactInfo = $map['contact_info'];
        }
        if(isset($map['debug_mode'])){
            $model->debugMode = $map['debug_mode'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['env_params'])){
            if(!empty($map['env_params'])){
                $model->envParams = [];
                $n = 0;
                foreach($map['env_params'] as $item) {
                    $model->envParams[$n++] = null !== $item ? BuildpackParamTemplate::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['full_version'])){
            $model->fullVersion = $map['full_version'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['supported_os'])){
            if(!empty($map['supported_os'])){
                $model->supportedOs = $map['supported_os'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 技术栈的编译打包命令
    /**
     * @var string
     */
    public $buildCommand;

    // 分享给其他租户时留下的联系信息
    /**
     * @var string
     */
    public $contactInfo;

    // 当前技术栈是否是debug模式
    /**
     * @var bool
     */
    public $debugMode;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 环境变量
    /**
     * @var BuildpackParamTemplate[]
     */
    public $envParams;

    // 技术栈版本号
    /**
     * @var string
     */
    public $fullVersion;

    // 技术栈id
    /**
     * @var string
     */
    public $id;

    // 支持的操作系统ID
    /**
     * @var int[]
     */
    public $supportedOs;

}
