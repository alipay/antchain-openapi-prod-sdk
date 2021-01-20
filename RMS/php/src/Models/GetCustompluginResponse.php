<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\AlarmPkgDO;

class GetCustompluginResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'id' => 'id',
        'name' => 'name',
        'alarmed' => 'alarmed',
        'pluginId' => 'plugin_id',
        'pluginType' => 'plugin_type',
        'creator' => 'creator',
        'modifier' => 'modifier',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'alarmPkgs' => 'alarm_pkgs',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->alarmed) {
            $res['alarmed'] = $this->alarmed;
        }
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->alarmPkgs) {
            $res['alarm_pkgs'] = [];
            if(null !== $this->alarmPkgs && is_array($this->alarmPkgs)){
                $n = 0;
                foreach($this->alarmPkgs as $item){
                    $res['alarm_pkgs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetCustompluginResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['alarmed'])){
            $model->alarmed = $map['alarmed'];
        }
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['plugin_type'])){
            $model->pluginType = $map['plugin_type'];
        }
        if(isset($map['creator'])){
            $model->creator = $map['creator'];
        }
        if(isset($map['modifier'])){
            $model->modifier = $map['modifier'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['alarm_pkgs'])){
            if(!empty($map['alarm_pkgs'])){
                $model->alarmPkgs = [];
                $n = 0;
                foreach($map['alarm_pkgs'] as $item) {
                    $model->alarmPkgs[$n++] = null !== $item ? AlarmPkgDO::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // ID
    /**
     * @var int
     */
    public $id;

    // 自定义监控名称
    /**
     * @var string
     */
    public $name;

    // 是否有报警
    /**
     * @var bool
     */
    public $alarmed;

    // 监控类型id
    /**
     * @var int
     */
    public $pluginId;

    // 监控类型
    /**
     * @var string
     */
    public $pluginType;

    // 创建者
    /**
     * @var string
     */
    public $creator;

    // 最后修改者
    /**
     * @var string
     */
    public $modifier;

    // 创建时间戳
    /**
     * @var int
     */
    public $gmtCreate;

    // 最后修改时间 - 时间戳
    /**
     * @var int
     */
    public $gmtModified;

    // 告警套餐列表
    /**
     * @var AlarmPkgDO[]
     */
    public $alarmPkgs;

}
