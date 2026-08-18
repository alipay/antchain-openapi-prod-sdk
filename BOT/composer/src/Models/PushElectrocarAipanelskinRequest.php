<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushElectrocarAipanelskinRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tuid' => 'tuid',
        'skinId' => 'skin_id',
        'skinName' => 'skin_name',
        'skinType' => 'skin_type',
        'skinVer' => 'skin_ver',
        'skinSize' => 'skin_size',
        'screenW' => 'screen_w',
        'screenH' => 'screen_h',
        'formatVer' => 'format_ver',
        'url' => 'url',
        'ext' => 'ext',
    ];
    public function validate() {
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('skinId', $this->skinId, true);
        Model::validateRequired('skinName', $this->skinName, true);
        Model::validateRequired('skinType', $this->skinType, true);
        Model::validateRequired('skinVer', $this->skinVer, true);
        Model::validateRequired('skinSize', $this->skinSize, true);
        Model::validateRequired('screenW', $this->screenW, true);
        Model::validateRequired('screenH', $this->screenH, true);
        Model::validateRequired('url', $this->url, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->skinId) {
            $res['skin_id'] = $this->skinId;
        }
        if (null !== $this->skinName) {
            $res['skin_name'] = $this->skinName;
        }
        if (null !== $this->skinType) {
            $res['skin_type'] = $this->skinType;
        }
        if (null !== $this->skinVer) {
            $res['skin_ver'] = $this->skinVer;
        }
        if (null !== $this->skinSize) {
            $res['skin_size'] = $this->skinSize;
        }
        if (null !== $this->screenW) {
            $res['screen_w'] = $this->screenW;
        }
        if (null !== $this->screenH) {
            $res['screen_h'] = $this->screenH;
        }
        if (null !== $this->formatVer) {
            $res['format_ver'] = $this->formatVer;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushElectrocarAipanelskinRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['skin_id'])){
            $model->skinId = $map['skin_id'];
        }
        if(isset($map['skin_name'])){
            $model->skinName = $map['skin_name'];
        }
        if(isset($map['skin_type'])){
            $model->skinType = $map['skin_type'];
        }
        if(isset($map['skin_ver'])){
            $model->skinVer = $map['skin_ver'];
        }
        if(isset($map['skin_size'])){
            $model->skinSize = $map['skin_size'];
        }
        if(isset($map['screen_w'])){
            $model->screenW = $map['screen_w'];
        }
        if(isset($map['screen_h'])){
            $model->screenH = $map['screen_h'];
        }
        if(isset($map['format_ver'])){
            $model->formatVer = $map['format_ver'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['ext'])){
            $model->ext = $map['ext'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // ekyt设备唯一标识
    /**
     * @var string
     */
    public $tuid;

    // 皮肤id
    /**
     * @var int
     */
    public $skinId;

    // 皮肤名称
    /**
     * @var string
     */
    public $skinName;

    // 0 全量、1 背景图、2 开关机动画、3 电子宠物动画
    /**
     * @var int
     */
    public $skinType;

    // 皮肤版本号
    /**
     * @var int
     */
    public $skinVer;

    // 文件大小，单位字节
    /**
     * @var int
     */
    public $skinSize;

    // 是	目标屏幕宽高
    /**
     * @var int
     */
    public $screenW;

    // 目标屏幕高
    /**
     * @var int
     */
    public $screenH;

    // 格式版本
    /**
     * @var int
     */
    public $formatVer;

    // 打包皮肤url地址
    /**
     * @var string
     */
    public $url;

    // 可选扩展字段
    /**
     * @var string
     */
    public $ext;

}
