<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Application extends Model {
    protected $_name = [
        'depends' => 'depends',
        'name' => 'name',
        'serviceName' => 'service_name',
        'version' => 'version',
        'customParamsMap' => 'custom_params_map',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->depends) {
            $res['depends'] = $this->depends;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->customParamsMap) {
            $res['custom_params_map'] = $this->customParamsMap;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Application
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['depends'])){
            if(!empty($map['depends'])){
                $model->depends = $map['depends'];
            }
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['service_name'])){
            $model->serviceName = $map['service_name'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['custom_params_map'])){
            $model->customParamsMap = $map['custom_params_map'];
        }
        return $model;
    }
    // 应用部署时依赖的应用名称，只允许取此次调用参数中列出的应用。不允许形成循环依赖。
    /**
     * @example 
     * @var string[]
     */
    public $depends;

    // 执行部署操作的目标应用名称，应用名称最大60个UTF-8字符
    /**
     * @example 
     * @var string
     */
    public $name;

    // 执行部署操作的目标应用服务名称，应用服务名称最大60个UTF-8字符
    /**
     * @example 
     * @var string
     */
    public $serviceName;

    // 执行部署操作的目标应用版本。如果某个应用未指定版本，则使用最新版本部署。
    /**
     * @example 
     * @var string
     */
    public $version;

    // 自定义参数 jsonStr Map<String,List<String>>
    /**
     * @example "{"hello":["world"],"key":["val222"]}"
     * @var string
     */
    public $customParamsMap;

}
