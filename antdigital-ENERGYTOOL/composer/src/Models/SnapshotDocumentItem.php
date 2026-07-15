<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class SnapshotDocumentItem extends Model {
    protected $_name = [
        'nodeId' => 'node_id',
        'documentId' => 'document_id',
        'documentName' => 'document_name',
        'fileType' => 'file_type',
        'ossUrl' => 'oss_url',
        'md5' => 'md5',
        'vectorStoreMapId' => 'vector_store_map_id',
        'source' => 'source',
        'sourceExt' => 'source_ext',
        'tags' => 'tags',
    ];
    public function validate() {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('documentId', $this->documentId, true);
        Model::validateRequired('documentName', $this->documentName, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('ossUrl', $this->ossUrl, true);
        Model::validateRequired('vectorStoreMapId', $this->vectorStoreMapId, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('sourceExt', $this->sourceExt, true);
        Model::validateRequired('tags', $this->tags, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->documentId) {
            $res['document_id'] = $this->documentId;
        }
        if (null !== $this->documentName) {
            $res['document_name'] = $this->documentName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->ossUrl) {
            $res['oss_url'] = $this->ossUrl;
        }
        if (null !== $this->md5) {
            $res['md5'] = $this->md5;
        }
        if (null !== $this->vectorStoreMapId) {
            $res['vector_store_map_id'] = $this->vectorStoreMapId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->sourceExt) {
            $res['source_ext'] = $this->sourceExt;
        }
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SnapshotDocumentItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
        }
        if(isset($map['document_id'])){
            $model->documentId = $map['document_id'];
        }
        if(isset($map['document_name'])){
            $model->documentName = $map['document_name'];
        }
        if(isset($map['file_type'])){
            $model->fileType = $map['file_type'];
        }
        if(isset($map['oss_url'])){
            $model->ossUrl = $map['oss_url'];
        }
        if(isset($map['md5'])){
            $model->md5 = $map['md5'];
        }
        if(isset($map['vector_store_map_id'])){
            $model->vectorStoreMapId = $map['vector_store_map_id'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['source_ext'])){
            $model->sourceExt = $map['source_ext'];
        }
        if(isset($map['tags'])){
            if(!empty($map['tags'])){
                $model->tags = $map['tags'];
            }
        }
        return $model;
    }
    // 节点ID
    /**
     * @example node_id
     * @var string
     */
    public $nodeId;

    // 文档ID
    /**
     * @example document_id
     * @var string
     */
    public $documentId;

    // 文档名称
    /**
     * @example document_name
     * @var string
     */
    public $documentName;

    // 文件类型
    /**
     * @example file_type
     * @var string
     */
    public $fileType;

    // 下载原文的链接
    /**
     * @example oss_url
     * @var string
     */
    public $ossUrl;

    // 原文的md5
    /**
     * @example md5
     * @var string
     */
    public $md5;

    // 向量文档ID
    /**
     * @example vector_store_map_id
     * @var string
     */
    public $vectorStoreMapId;

    // 文档来源
    /**
     * @example source
     * @var string
     */
    public $source;

    // 文档来源附带的额外信息
    /**
     * @example source_ext
     * @var string
     */
    public $sourceExt;

    // 标签
    /**
     * @example tags
     * @var string[]
     */
    public $tags;

}
