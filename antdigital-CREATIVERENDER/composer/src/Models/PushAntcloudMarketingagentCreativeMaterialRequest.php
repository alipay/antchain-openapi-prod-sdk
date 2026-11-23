<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

use AntChain\CREATIVERENDER\Models\MaterialTemplateData;

class PushAntcloudMarketingagentCreativeMaterialRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'fileId' => 'file_id',
        'productCode' => 'product_code',
        'materialUsage' => 'material_usage',
        'materialForm' => 'material_form',
        'materialType' => 'material_type',
        'spaceType' => 'space_type',
        'durationSeconds' => 'duration_seconds',
        'name' => 'name',
        'scene' => 'scene',
        'industry' => 'industry',
        'publishPlatforms' => 'publish_platforms',
        'prompt' => 'prompt',
        'thumbnailFileid' => 'thumbnail_fileid',
        'coverIndex' => 'cover_index',
        'thumbnailOssPath' => 'thumbnail_oss_path',
        'metadata' => 'metadata',
        'sourceMessageId' => 'source_message_id',
        'sourceResultIndex' => 'source_result_index',
        'templateData' => 'template_data',
        'itemTemplatesJson' => 'item_templates_json',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('materialUsage', $this->materialUsage, true);
        Model::validateRequired('materialForm', $this->materialForm, true);
        Model::validateRequired('materialType', $this->materialType, true);
        Model::validateRequired('spaceType', $this->spaceType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->materialUsage) {
            $res['material_usage'] = $this->materialUsage;
        }
        if (null !== $this->materialForm) {
            $res['material_form'] = $this->materialForm;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        if (null !== $this->spaceType) {
            $res['space_type'] = $this->spaceType;
        }
        if (null !== $this->durationSeconds) {
            $res['duration_seconds'] = $this->durationSeconds;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->publishPlatforms) {
            $res['publish_platforms'] = $this->publishPlatforms;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->thumbnailFileid) {
            $res['thumbnail_fileid'] = $this->thumbnailFileid;
        }
        if (null !== $this->coverIndex) {
            $res['cover_index'] = $this->coverIndex;
        }
        if (null !== $this->thumbnailOssPath) {
            $res['thumbnail_oss_path'] = $this->thumbnailOssPath;
        }
        if (null !== $this->metadata) {
            $res['metadata'] = $this->metadata;
        }
        if (null !== $this->sourceMessageId) {
            $res['source_message_id'] = $this->sourceMessageId;
        }
        if (null !== $this->sourceResultIndex) {
            $res['source_result_index'] = $this->sourceResultIndex;
        }
        if (null !== $this->templateData) {
            $res['template_data'] = null !== $this->templateData ? $this->templateData->toMap() : null;
        }
        if (null !== $this->itemTemplatesJson) {
            $res['item_templates_json'] = $this->itemTemplatesJson;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushAntcloudMarketingagentCreativeMaterialRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['fileObjectName'])){
            $model->fileObjectName = $map['fileObjectName'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['material_usage'])){
            $model->materialUsage = $map['material_usage'];
        }
        if(isset($map['material_form'])){
            $model->materialForm = $map['material_form'];
        }
        if(isset($map['material_type'])){
            $model->materialType = $map['material_type'];
        }
        if(isset($map['space_type'])){
            $model->spaceType = $map['space_type'];
        }
        if(isset($map['duration_seconds'])){
            $model->durationSeconds = $map['duration_seconds'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['industry'])){
            $model->industry = $map['industry'];
        }
        if(isset($map['publish_platforms'])){
            $model->publishPlatforms = $map['publish_platforms'];
        }
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        if(isset($map['thumbnail_fileid'])){
            $model->thumbnailFileid = $map['thumbnail_fileid'];
        }
        if(isset($map['cover_index'])){
            $model->coverIndex = $map['cover_index'];
        }
        if(isset($map['thumbnail_oss_path'])){
            $model->thumbnailOssPath = $map['thumbnail_oss_path'];
        }
        if(isset($map['metadata'])){
            $model->metadata = $map['metadata'];
        }
        if(isset($map['source_message_id'])){
            $model->sourceMessageId = $map['source_message_id'];
        }
        if(isset($map['source_result_index'])){
            $model->sourceResultIndex = $map['source_result_index'];
        }
        if(isset($map['template_data'])){
            $model->templateData = MaterialTemplateData::fromMap($map['template_data']);
        }
        if(isset($map['item_templates_json'])){
            $model->itemTemplatesJson = $map['item_templates_json'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // string
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 产品类型
    /**
     * @var string
     */
    public $productCode;

    // 素材用途
    /**
     * @var string
     */
    public $materialUsage;

    // 素材形式（单个素材还是素材包）
    /**
     * @var string
     */
    public $materialForm;

    // 素材文件格式
    /**
     * @var string
     */
    public $materialType;

    // 素材空间类型（平台空间、企业空间、个人空间），不同空间下权限不一样
    /**
     * @var string
     */
    public $spaceType;

    // 后续要做 AI 解析就要传,单文件音视频时长
    /**
     * @var string
     */
    public $durationSeconds;

    // 素材名， 不传用文件名
    /**
     * @var string
     */
    public $name;

    // 使用场景编码
    /**
     * @var string
     */
    public $scene;

    // 行业编码
    /**
     * @var string
     */
    public $industry;

    // 多个投放平台编码用英文逗号分隔
    /**
     * @var string
     */
    public $publishPlatforms;

    // 生图模板复用时回填的提示词；仅 GENERATION_TEMPLATE 使用
    /**
     * @var string
     */
    public $prompt;

    // 单文件视频缩略图 AFTS fileId
    /**
     * @var string
     */
    public $thumbnailFileid;

    // 封面文件下标，从 0 开始；素材包默认 0
    /**
     * @var int
     */
    public $coverIndex;

    // 视频缩略图的受管 OSS 路径
    /**
     * @var string
     */
    public $thumbnailOssPath;

    // 逐文件媒体信息，传 JSON 数组字符串；素材包的时长和缩略图从这里取
    /**
     * @var string
     */
    public $metadata;

    // 从生成结果保存时必传
    /**
     * @var string
     */
    public $sourceMessageId;

    // 1，选第二个生成结果；默认 0
    /**
     * @var int
     */
    public $sourceResultIndex;

    // 来源消息保存时必传；普通上传选填
    /**
     * @var MaterialTemplateData
     */
    public $templateData;

    // 模版json
    /**
     * @var string
     */
    public $itemTemplatesJson;

}
